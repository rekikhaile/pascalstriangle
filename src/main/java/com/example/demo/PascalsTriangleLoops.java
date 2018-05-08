package com.example.demo;

import java.util.Scanner;

public class PascalsTriangleLoops {
    public static void main(String[] args) {
        int row = 7;
        printPascal(row);
    }


    public static void printPascal(int n) {
        int[] previousRow;
        int[] currentRow={1};
        printArray(currentRow);
        previousRow=currentRow;

        for (int i=2; i <= n; i++){
            currentRow = new int[i];
            currentRow[0]=1;
            currentRow[i-1]=1;
            for(int j=0; j<=i-3; j++){
                currentRow[j+1] = previousRow[j] + previousRow[j+1];
            }
            printArray(currentRow);
            previousRow = currentRow;
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
