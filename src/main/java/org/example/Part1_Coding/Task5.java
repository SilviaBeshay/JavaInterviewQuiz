package org.example.Part1_Coding;

import java.util.Arrays;

/*
Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
 */
public class Task5 {
    public static void main(String[] args) {
        String word1 = "Listen";
        String word2 = "Silent";
        System.out.println(isAnagram(word1,word2));
    }
    public static boolean isAnagram(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return false;
        }
        if (word1.length() != word2.length()) {
            return false;
        }
        char [] char1=word1.toLowerCase().toCharArray();
        char [] char2= word2.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return new String(char1).equals(new String(char2));

    }
}