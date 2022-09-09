package com.sunglowsys;

import java.util.Scanner;

public class RevLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reverse letter");
        String str = scanner.nextLine();
        String words[] = str.split("");
        String reversedString = "";
        for (int i = 0; i<words.length; i++ ) {
            String word = words[i];
           String reverseWord  = "";
           for (int j = word.length()-1; j>=0; j--) {
                reverseWord = reverseWord + word.charAt(j);
           }
           reversedString = reversedString + reverseWord + " ";
        }
            System.out.println("ReversedString   " + reversedString);

    }
}
