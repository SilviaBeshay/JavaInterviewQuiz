package org.example.Part1_Coding;

public class Task6 {
    public static void main(String[] args) {
        String word="documentation";
       String onlyVowels =word.replaceAll("[^aeiou]","");
        System.out.println(onlyVowels);
        System.out.println(onlyVowels.length());

    }


}
