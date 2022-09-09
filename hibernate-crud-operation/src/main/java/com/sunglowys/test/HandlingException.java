package com.sunglowys.test;

public class HandlingException {
    public static void main(String[] args) {
        try {
           int s1 = 100;
          int s2= 100/0;

        } catch (Exception e) {
            int s3 = 200/0;
        }
        System.out.println("rest of the code");
    }

}
