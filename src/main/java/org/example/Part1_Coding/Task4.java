package org.example.Part1_Coding;

import java.util.Scanner;

/*
Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any Word");
        String s= scan.next();
        StringBuilder str=new StringBuilder(s);
        String reversed = str.reverse().toString().toLowerCase();
        if (reversed.equals(s.toLowerCase())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
