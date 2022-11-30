package com.bzl.dayfive;

import java.util.Scanner;

public class TwoDArray {
    int M;
    int N;
    int k;
    void twoDArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        M = sc.nextInt();
        System.out.println("Enter number of columns : ");
        N = sc.nextInt();
        int[][] array = new int[M][N];
        System.out.println("Enter "+M * N+" values to fill 2D array : ");
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                k++;
                System.out.print(k+".");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered 2D Array ");
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        TwoDArray ob = new TwoDArray();
        ob.twoDArray();
    }
}