package com.simbirsoft.itplace.dao.repository.impl;

import com.simbirsoft.itplace.dao.repository.PersonRepository;
import com.simbirsoft.itplace.domain.entity.PersonalData;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Реализация PersonRepository. Позволяет получать данные из .properties файлов.
 *
 * @author an.stratonov
 * @version 1.0
 */
public class PersonRepositoryFromPropertyFileImpl implements PersonRepository {

    private Properties personDataFile;

    public PersonRepositoryFromPropertyFileImpl(InputStream configFileInput){
        this.personDataFile = getProperties(configFileInput);
    }

    /**
     * Возвращает объект файла найстроек
     *
     * @param configFileInput - поток файла настроек
     * @return - объект Properties
     */
    private Properties getProperties(InputStream configFileInput) {
        Properties property = new Properties();
        try {
            property.load(configFileInput);
            return property;
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл настроек");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Метод преобразует Properties файл в map
     * Совеутю посмотреть: http://www.leveluplunch.com/java/examples/convert-properties-to-map/
     * @param properties - файл со свойствами
     * @return - возвращает Map объект со свойствами
     */
    private Map<String, String> generateMapFromProperties(Properties properties){
        Stream<Map.Entry<Object, Object>> stream = properties.entrySet().stream();
        return stream.collect(Collectors.toMap(
                e -> String.valueOf(e.getKey()),
                e -> String.valueOf(e.getValue())));
    }

    @Override
    public PersonalData getPersonalData() {
        PersonalData personalData = null;
        if(this.personDataFile != null){
            Map<String, String> propertyMap = generateMapFromProperties(this.personDataFile);
        }
        return personalData;
    }
}
