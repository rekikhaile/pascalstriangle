package com.example.demo;

public class RiriPascal {

    public static void main(String[] args) {

        int n = 7;
        int maxIndex = n -1;
        for(int i=0; i<n; i++){
            //System.out.println("1");
            for(int j =0; j<n; j++){
                if(i==j)
                System.out.print(1);
                else if(j==0)
                    System.out.print(1);
                else if(i==2 && j==1)
                    System.out.print(j+(i-1));
                else
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}
