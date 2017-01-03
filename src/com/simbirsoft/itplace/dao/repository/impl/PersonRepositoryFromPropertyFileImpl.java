package com.simbirsoft.itplace.dao.repository.impl;

import com.simbirsoft.itplace.dao.repository.PersonRepository;
import com.simbirsoft.itplace.domain.entity.PersonalData;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PersonRepositoryFromPropertyFileImpl implements PersonRepository {

    Properties personDataFile;

    PersonRepositoryFromPropertyFileImpl(InputStream configFileInput){
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

    @Override
    public PersonalData getPersonalData() {
        return null;
    }
}
