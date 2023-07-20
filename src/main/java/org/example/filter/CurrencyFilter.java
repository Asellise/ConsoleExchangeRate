package org.example.filter;

import org.example.model.Valute;

import java.util.List;

public class CurrencyFilter {

    public Valute filter(String currencyName, List<Valute> valutes){
        Valute searched = null;
        for(Valute valute: valutes) {
            if(valute.getCharCode().equals(currencyName)) {
                searched = valute;
                break;
            }
        }
        return searched;
    }
}
