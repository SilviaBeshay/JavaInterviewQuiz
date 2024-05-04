package org.example.Part1_Coding;
/*
Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
 */
public class Task7 {
    static int count(String words){
        return words.split(" ").length;
    }

    public static void main(String[] args) {
        System.out.println(count("Hello, World"));
    }
}
