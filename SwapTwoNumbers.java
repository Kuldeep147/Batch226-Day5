package com.bzl.dayfive;

import java.util.Scanner;

public class SwapTwoNumbers {
    void swap(){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("Swapped " + a + " " + b);
    }
    public static void main(String[] args) {
        SwapTwoNumbers ob = new SwapTwoNumbers();
        ob.swap();
    }
}