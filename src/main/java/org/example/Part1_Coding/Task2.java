package org.example.Part1_Coding;

import java.util.ArrayList;

/*
2. Find out how many alpha characters are present in a string?
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList <String> name=new ArrayList();
         name.add("Silvia");
         name.add("Rafy");
         name.forEach(x-> System.out.println(x.length()));

        String s="I love Java";
        int count=0;
        for(int i=0; i<s.length();i++){
            if (s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }

}
