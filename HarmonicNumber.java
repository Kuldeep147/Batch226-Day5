package com.bzl.dayfive;

import java.util.Scanner;

public class HarmonicNumber {
    double nth;
    double t;
    void harmonicValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        nth = sc.nextInt();
        if (nth > 0){
            for(double i = 1; i <= nth; i++){
                t += 1/i;
            }
            System.out.println("Harmonic Value : "+t);
        }
    }
    public static void main(String[] args) {
        HarmonicNumber ob = new HarmonicNumber();
        ob.harmonicValue();
    }
}