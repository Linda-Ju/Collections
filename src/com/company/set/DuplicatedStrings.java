package com.company.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> strings = new HashSet<>();

        //1st way
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a string: ");
            if (!strings.add(scanner.next())) {
                System.out.println("Duplicate encountered");
            }
        }
        System.out.println("strings = " + strings);

        // 2nd way
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a string: ");
            strings.add(scanner.next());
        }
        System.out.println("strings = " + strings);
    }
}
