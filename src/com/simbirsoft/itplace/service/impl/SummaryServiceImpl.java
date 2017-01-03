package com.simbirsoft.itplace.service.impl;

import com.simbirsoft.itplace.dao.repository.PersonRepository;
import com.simbirsoft.itplace.dao.repository.impl.PersonRepositoryFromPropertyFileImpl;
import com.simbirsoft.itplace.domain.entity.PersonalData;
import com.simbirsoft.itplace.service.api.SummaryService;

public class SummaryServiceImpl implements SummaryService {

    PersonalData personalData;

    public SummaryServiceImpl(String propertyFilePath){
        PersonRepository personRepository = new PersonRepositoryFromPropertyFileImpl(
                getClass().getClassLoader().getResourceAsStream(propertyFilePath)
        );
        this.personalData = personRepository.getPersonalData();
    }

    @Override
    public void createHtmlFile(String Path) {

        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <style>\n" +
                "        #body{position:relative;min-height:100%;width:100%;word-wrap: break-word;}\n" +
                "        #bg-left{position:absolute;top:0px;left:0px;bottom:0px;width:65%;z-index:1;}\n" +
                "        #bg-right{position:absolute;top:0px;right:0px;bottom:0px;width:35%;z-index:1}\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"body\">\n" +
                "    Резюме\n" +
                "    на должность Java-стажер\n" +
                "    <div id=\"bg-left\">\n" +
                "        <h4>\n" +
                "            Стратонов Алексей Николаевич\n" +
                "            Дата рождения: 20.06.1994 г.\n" +
                "            Адрес проживания: г. Ульяновск.\n" +
                "            пр. Героя России Аврьянова, д. 2, кв 130\n" +
                "            Телефон: моб. 8(927)632-89-84\n" +
                "            e-mail: an.stratonov@gmail.com\n" +
                "            Skype: alexstrat2008\n" +
                "        </h4>\n" +
                "    </div>\n" +
                "    <div id=\"bg-right\"><img src=\"https://pp.vk.me/c604420/v604420985/31f0f/_MS61ivGiMM.jpg\" height=\"150\"></div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
    }
}
