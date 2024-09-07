package Recursion;

import java.util.Scanner;

public class Main {

    static void printIncreasing(int n){
        // Base work
        if (n == 1){
            System.out.println(n);
            return;
        }
        // Recursive Work
        printIncreasing(n-1);
        // Self Work
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
