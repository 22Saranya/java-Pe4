package com.stackroute.pe3;
import java.util.*;
public class OccuranceofCharecter {
            public static void main(String[] args) {
            String str = "Java is java again java again";
            int charcount = str.length() - str.replaceAll("a", "").length();
            System.out.println("Occurrence of a char in given String: " + charcount);
        }
    }

