package com.bzl.dayfive;

import java.util.Scanner;

public class WindChill {
    double t;
    double v;
    double w;
    int temp;
    void windChill(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t in Fahrenheit : ");
        t = sc.nextInt();
        System.out.println("Enter v in miles per hour : ");
        v = sc.nextInt();
        if ( t <= 50 && v >= 3 &&  v <= 120  ){
            w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v,0.16));
        }else {
            System.out.println("Enter t <= 50 and 3 <= v <= 120");
            temp = 13;
        }
        if( temp != 13){
            System.out.println("Wind chill is : "+w);
        }

    }
    public static void main(String[] args) {
        WindChill ob = new WindChill();
        ob.windChill();
    }
}