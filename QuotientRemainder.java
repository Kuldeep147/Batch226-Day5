package com.bzl.dayfive;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class QuotientRemainder {
    int dividend;
    int divisor;
    void quotientRemainder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divisor : ");
        divisor = sc.nextInt();
        System.out.println("Enter dividend : ");
        dividend = sc.nextInt();
        int remainder = divisor%dividend;
        int quotient = divisor/dividend;
        System.out.println("Remainder : "+remainder);
        System.out.println("Quotient : "+quotient);
    }


    public static void main(String[] args) {
        QuotientRemainder ob = new QuotientRemainder();
        ob.quotientRemainder();
    }
}