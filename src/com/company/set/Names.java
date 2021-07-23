package com.company.set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a name: ");
            names.add(scanner.next());
        }
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}

