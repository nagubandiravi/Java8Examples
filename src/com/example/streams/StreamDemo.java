package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Java 8 Stream Examples
 * @author RNAGUBAN
 */
public class StreamDemo {
    
    public static void main(String[] args) {
        List<String> input = Arrays.asList("John", "David", "Rod", "Bob", "Charles", "");
        
        // Iterate and display the strings in the List.
        input.stream().forEach(System.out::println);
        System.out.println("------------------------------------------");
        
        // Display Strings whose length is less than 4.
        input.stream().filter(str -> str.length() < 4).forEach(System.out::println);
        System.out.println("------------------------------------------");
        
        // Display all strings containing character 'o'.
        boolean stringExists = input.stream().anyMatch(str -> str.contains("o"));
        System.out.println("String with 'o' character exists : "+stringExists);
        System.out.println("------------------------------------------");
        
        // Check if Strings length is greater than 0
        Predicate<String> p1 = str -> str.length() > 0;
        boolean length = input.stream().allMatch(p1);
        System.out.println("String with 0 length does not exist : "+length);
        System.out.println("------------------------------------------");
        
        // Display Strings whose length is greater than 3 and limit the results to 2.
        input.stream().filter(str -> str.length() > 3).limit(2).forEach(System.out::println);
        System.out.println("------------------------------------------");
        
        
    }
}
