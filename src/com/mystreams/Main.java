/**
 *  Java program to read input and filter it.
 */

package com.mystreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Creating a list to store input data.
        List<String> inputs = new ArrayList<>();

        // Reading inputs.
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }

        // Counting numbers of values divisible by four.
        long numbersDivisibleByFour = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 4 == 0).count();

        // Working out the average.
        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s))
                .average().getAsDouble();

        // Printing the results.
        System.out.println("Dividable by four: " + numbersDivisibleByFour);
        System.out.println("Average number: " + average);

    }
}