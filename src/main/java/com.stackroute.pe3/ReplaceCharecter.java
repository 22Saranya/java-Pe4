package com.stackroute.pe3;

import java.util.Scanner;

public class ReplaceCharecter {
    public static void main(String[] args)
    {
        System.out.println("Input:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=str.replace("d","f").replace("l","t");
        System.out.println("Output:" +str1);
        System.out.println("Original String:"+str);
        System.out.println("New String:"+ str1);

    }
}
