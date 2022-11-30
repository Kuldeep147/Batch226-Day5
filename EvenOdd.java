package com.bzl.dayfive;

import java.util.Scanner;

public class EvenOdd {
    int a;
    void evenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number");
        a = sc.nextInt();
        if (a%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        EvenOdd ob = new EvenOdd();
        ob.evenOdd();
    }
}