package Recursion;

import java.util.Scanner;

public class multipleNums {

    static void   Multiple(int n, int k){

        if(k == 1){
            System.out.println(n);
            return;
        }


         Multiple(n, k-1);
        System.out.println((n*k));

        /**
        if (n >= k){
            return  Multiple(n*k, k+1);

        }
        return Multiple(n, k);
         **/

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Multiple(n, k);
    }
}
