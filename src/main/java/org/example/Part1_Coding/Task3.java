package org.example.Part1_Coding;

public class Task3 {
    public static void main(String[] args) {
        String welcome="Hello";
        StringBuilder str=new StringBuilder(welcome);
        String reversed = str.reverse().toString().toLowerCase();
        System.out.println(str);
    }
}
