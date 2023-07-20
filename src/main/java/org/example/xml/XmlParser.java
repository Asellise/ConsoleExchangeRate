package org.example.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.model.ValCurs;

import java.io.IOException;

public class XmlParser {

    public ValCurs parse(String xml) throws IOException{
        XmlMapper xmlMapper = new XmlMapper();
        ValCurs value = xmlMapper.readValue(xml, ValCurs.class);

        return value;
    }
}
