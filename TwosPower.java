package com.bzl.dayfive;
import java.util.Scanner;

public class TwosPower {
    int twosPower;
    void powerOfTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter power of two less than 31 : ");
        twosPower = sc.nextInt();
        if (twosPower < 31 && twosPower >= 0){
            for (int i = 0; i <= twosPower; i++){
                System.out.println(Math.pow(2,i));
            }
        }else {
            System.out.println("enter between 0 and 31");
        }

    }
    public static void main(String[] args) {
        TwosPower ob = new TwosPower();
        ob.powerOfTwo();
    }
}