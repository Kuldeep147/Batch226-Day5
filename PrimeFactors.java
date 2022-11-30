package com.bzl.dayfive;

import java.util.Scanner;

public class PrimeFactors {
    int num;
    int isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                return 0;
            }
        }return 1;
    }
    void primeFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find prime factors : ");
        num = sc.nextInt();
        for(int i = 2; i < num; i++){
            if (num%i == 0 ){
                int c = isPrime(i);
                if (c == 1){
                    System.out.print(i+ " ");
                }
            }
        }
        System.out.println("Prime Factors of "+num);
    }


    public static void main(String[] args) {
        PrimeFactors ob = new PrimeFactors();
        ob.primeFactors();
    }
}