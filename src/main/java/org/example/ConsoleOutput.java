package org.example;

import org.example.connector.CbrConnector;
import org.example.connector.CbrConnectorDirect;
import org.example.filter.CurrencyFilter;
import org.example.model.ValCurs;
import org.example.model.Valute;
import org.example.xml.XmlParser;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class ConsoleOutput {

    public static void main(String[] args) throws IOException {
        CbrConnector cbrConnector = new CbrConnectorDirect(new RestTemplate());
        XmlParser xmlParser = new XmlParser();
        CurrencyFilter currencyFilter = new CurrencyFilter();

        String xml = cbrConnector.getDailyByCurrency("02-03-2002");
        ValCurs valCurs = xmlParser.parse(xml);
        Valute valute = currencyFilter.filter("USD", valCurs.getValute());

        System.out.println(valute.getCharCode() + " " + valute.getName() + ":" + valute.getValue());
    }
}
