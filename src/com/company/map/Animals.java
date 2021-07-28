package com.company.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Animals {
    public static void main(String[] args) {

        Map<String, String> animals = new TreeMap();

        animals.put("lion", "roar, roar!");
        animals.put("pig", "oink, oink!");
        animals.put("horse", "neigh, neigh!");
        animals.put("chicken", "cha-caw!");

        for (String animal : animals.keySet()) {
            System.out.println("The " + animal + " says: " + animals.get(animal));
        }

        System.out.println();

        Map<String, String> animalsAndKids = new TreeMap();
        animalsAndKids.put("lion", "cub");
        animalsAndKids.put("pig", "piglet");
        animalsAndKids.put("horse", "colt");
        animalsAndKids.put("chicken", "chick");

        for (String kid : animalsAndKids.keySet()) {
            System.out.println("The " + kid + "'s baby is " + animalsAndKids.get(kid));
        }
    }
}
