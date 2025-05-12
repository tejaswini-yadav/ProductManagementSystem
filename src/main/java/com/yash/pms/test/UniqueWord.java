package com.yash.pms.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UniqueWord {
	static void printUniqueWords(String str)
    {// Maintaining a count variable
        int count;
        // Extract words from string
        // using split() method
        String[] words = str.split("\\W");
        // Iterating over the words array
        for (int i = 0; i < words.length; i++) {
            // Setting count of current word to one
            count = 1;
 
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
 
                    // If word found later in array
                    // increment the count variable
                    count++;
 
                    words[j] = "";
                }
            }
            // If count of current word is one print it
            if (count == 1 && words[i] != "")
 
                // Print statement
                System.out.println(words[i]);
        }
    }
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {        // Custom input string
        String str = "Welcome to geeks for geeks"; 
        // Calling the method 1 to print all unique words
        // in above string passed as argument
        printUniqueWords(str);
        
        //List<Integer> list=Arrays.asList(1,2,3,4);
        
        //list.stream().map(n->n%2!=0?n:n*n).collect(Collectors.toList()).forEach(System.out::println);
        
        List<String> lists=Arrays.asList("teja","hi","teja","hello");
        Set<String> set=  new HashSet<String>();
        set.addAll(lists);
        System.out.print(set);
    }
}
