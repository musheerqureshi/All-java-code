package Array;

import java.util.Scanner;

public class copyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int [] arr = new int[n];

         for (int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
         }

         for (int i = 0; i < arr.length; i++){
             System.out.println(arr[i]);
             }
         // trying to copy arr to arr2
         int[]  arr2 = arr;
         for (int i = 0; i < arr.length; i++){
             System.out.println(arr2[i]);
         }
         }
    }

