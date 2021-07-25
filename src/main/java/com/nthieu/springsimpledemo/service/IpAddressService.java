package com.nthieu.springsimpledemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@Slf4j
public class IpAddressService {
    @Value("${ipgeolocation.api.key}")
    private String apiKey;

    public String getInfoForIpAddress(String ipAddress) {
        RestTemplate restTemplate = new RestTemplate();
        String requestURI = UriComponentsBuilder.fromHttpUrl("https://api.ipgeolocation.io/ipgeo")
                .queryParam("apiKey", apiKey)
                .queryParam("ip", ipAddress)
                .toUriString();
        return restTemplate.getForEntity(requestURI, String.class).getBody();
    }
}
