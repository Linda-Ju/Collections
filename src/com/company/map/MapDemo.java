package com.company.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, String> countries = new TreeMap();

        countries.put("Nigeria", "Abuja");
        countries.put("USA", "Washington");
        countries.put("China", "Hong Kong");
        countries.put("Japan", "Tokyo");

        for (String country : countries.keySet()) {
            System.out.println("The capital of " + country + " is: " + countries.get(country));
        }
    }
}
