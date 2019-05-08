package com.stackroute.pe3;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();

        String[] arr = str.split(" ");
        for (String word : arr) {

            char[] wordArray = word.toCharArray();
            for (int i = wordArray.length-1; i >=0; i--) {
                System.out.print(wordArray[i]);
            }
            System.out.print(" ");
        }
    }
}

