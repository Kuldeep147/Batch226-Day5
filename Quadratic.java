package com.bzl.dayfive;

import java.util.Scanner;

public class Quadratic {
    double a;
    double b;
    double c;
    double delta;
    double rootOne;
    double rootTwo;
    int temp;
    void quadratic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coeff. of x square  a : ");
        a = sc.nextInt();
        System.out.println("Enter coeff. of x  b : ");
        b = sc.nextInt();
        System.out.println("Enter constant c : ");
        c = sc.nextInt();
        delta = b * b - 4 * a * c;
        if (delta < 0 ){
            System.out.println("Imaginary roots ");
            temp++;
        }
        if (temp == 0){
            rootOne = ( -b + Math.sqrt(delta))/(2 * a);
            rootTwo = ( -b - Math.sqrt(delta))/(2 * a);
            System.out.println("Root1 of x : "+rootOne);
            System.out.println("Root2 of x : "+rootTwo);
        }
    }
    public static void main(String[] args) {
        Quadratic ob = new Quadratic();
        ob.quadratic();
    }
}