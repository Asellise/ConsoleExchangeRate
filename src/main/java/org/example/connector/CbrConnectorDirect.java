package org.example.connector;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
public class CbrConnectorDirect implements CbrConnector {

    private final RestTemplate restTemplate;

    private static final String url = "http://www.cbr.ru/scripts/XML_daily.asp?date_req=%s";

    @Override
    public String getDailyByCurrency(String date) {
        ResponseEntity<String> response = restTemplate.getForEntity(
                String.format(url, date),
                String.class);

        return response.getBody();
    }
}
