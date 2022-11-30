package com.bzl.dayfive;

import java.util.Scanner;

public class VowelConsonant {
    void vowelConsonant(){
        String[] arr = {"a","e","i","o","u","A","E","I","O","U"};
        String a;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter : ");
        a = sc.nextLine();
        for(int i = 0; i < arr.length; i++){
            if ( a .equals(arr[i])){
                System.out.println("Vowel");
                break;
            }
            temp++;
        }
        if (temp == arr.length){
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        VowelConsonant ob = new VowelConsonant();
        ob.vowelConsonant();
    }
}