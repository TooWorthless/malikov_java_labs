package com.university.lab8;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        int a = 9/2;
        System.out.println(a);
        try {
            String jsonString = WeatherAPIClient.getWeatherData("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m");

            try {
                ObjectMapper objectMapper = new ObjectMapper();
    
                JsonNode jsonNode = objectMapper.readTree(jsonString);
    
                String prettyJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
                System.out.println("Pretty JSON: \n" + prettyJson);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}