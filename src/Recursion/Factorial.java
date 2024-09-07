package Recursion;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);


       /** if(n == 0){
            return 1;
        }
        int smallAns = factorial(n-1);
        int ans = n * smallAns;
        return ans; **/

    }


    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
