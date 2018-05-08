package com.example.demo;

// Java code for Pascal's Triangle
public class PascalsTriangle {

    // Function to print first
    // n lines of Pascal's Triangle

    public static void main(String[] args) {
       int n = 7;
        printPascal(n);
    }

    // Iterate through every line
    // and print entries in it

    public static void printPascal(int n){
        for(int line = 0; line < n; line++)
        {

            // Every line has number of
            // integers equal to line number
            for(int i=0; i<= line; i++)
                System.out.print(binomialCoeff(line,i)+" ");
            System.out.println();
        }
    }

    /*The binomial coefficients can be arranged to form
    Pascal's triangle, in which each entry is the sum of the two immediately above.*/
    public static int binomialCoeff(int n, int k){
        int res = 1;
        if(k> n -k)
            k= n - k;

        for(int i=0; i<k; i++)
        {
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
}
