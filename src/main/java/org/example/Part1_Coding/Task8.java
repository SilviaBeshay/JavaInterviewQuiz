package org.example.Part1_Coding;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("America");
        words.add("Conda");
        words.add("Egypt");
        words.add("Algeria");
        words.add("Arizona");
        words.removeIf(x->!x.toLowerCase().startsWith("a"));
        words.forEach(x-> System.out.println(x));
    }
}
