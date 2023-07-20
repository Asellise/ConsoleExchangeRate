package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Valute {
    @JacksonXmlProperty(isAttribute = true)
    private String ID;
    @JsonProperty("NumCode")
    private String NumCode;
    @JsonProperty("CharCode")
    private String CharCode;
    @JsonProperty("Nominal")
    private String Nominal;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Value")
    private String Value;
}
