package com.bzl.dayfive;

import java.util.Scanner;

public class SumOfIntegersAddToZero {
    void triplets(){
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number of integers : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" inputs of integers ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j <= n - 3; j++){
            if (arr[j] + arr[j + 1] + arr[j + 2] == 0){
                count++;
                System.out.println("Triplet : "+arr[j]+" ,"+arr[j+1]+" ,"+arr[j+2]);
            }
        }
        if (count == 0){
            System.out.println(" No triplets found ");
        }else if ( count > 0){
            System.out.println("Triplets found : "+count);
        }
    }
    public static void main(String[] args) {
        SumOfIntegersAddToZero ob = new SumOfIntegersAddToZero();
        ob.triplets();
    }
}