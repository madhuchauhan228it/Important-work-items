package com.sunglowys.test;

import java.util.Scanner;

public class AgeCandidate extends Exception {
    public AgeCandidate(String str) {
        System.out.println(str);
    }


    void AgeCandidate(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
            System.out.println("Enter Age");
            int age = s1.nextInt();
            try {
                if (age<18)
                {
                    throw new AgeCandidate("You are not eligible");
                } else {
                    System.out.println("You are eligble");
                }
            } catch (AgeCandidate e) {

            }
    }
}
