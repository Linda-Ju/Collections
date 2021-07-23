package com.company.set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a number: ");
            numbers.add(scanner.nextInt());
        }
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
    }
}
