package Recursion;

import java.util.Scanner;

public class printDecreasing {

    static void Print(int n){
        // Base Work
        if (n == 1){
            System.out.println(n);
            return;
        }
        // Self Work
        System.out.println(n);
        // Recursive Work
        Print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
    }
}
