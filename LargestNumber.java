package com.bzl.dayfive;

import java.util.Scanner;

public class LargestNumber {
    int d;
    void largestNumber(){
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if ( arr[i] > d){
                d = arr[i];
            }
        }
        System.out.println("Largest number : "+d);

    }
    public static void main(String[] args) {
        LargestNumber ob = new LargestNumber();
        ob.largestNumber();
    }
}