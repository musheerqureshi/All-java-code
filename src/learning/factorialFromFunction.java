package learning;

import java.util.Scanner;

public class factorialFromFunction {

    public static void printFactorail(int n){
        if (n < 0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;

        for (int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       printFactorail(n);

    }
}
