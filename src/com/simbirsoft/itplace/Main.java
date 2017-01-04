package com.simbirsoft.itplace;

import com.simbirsoft.itplace.service.api.SummaryService;
import com.simbirsoft.itplace.service.impl.SummaryServiceImpl;

/**
 * Точка входа в программу
 *
 * @author a.stratonov
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        SummaryService summaryService = new SummaryServiceImpl("resources/properties/person.properties");
        summaryService.createHtmlFile("web/summary.html");
    }
}
