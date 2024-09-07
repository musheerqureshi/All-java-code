package Array;

import java.util.Arrays;
import java.util.Scanner;

public class sortedOnesAnsZeroes {

    static void  Sorter(int[] arr){
        int n = arr.length;
        int zeroes = 0;
        // count the zeroes
        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                zeroes++;
            }
        }

        for (int i = 0; i < n; i++){
            if (i < zeroes) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }

    }

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter " + n + " elements ");
        for (int i = 0; i < n; i++){
            arr [i] = sc.nextInt();
        }
        System.out.println(" Original Array: ");
        printArray(arr);
        Sorter(arr);
        System.out.println(" Sorted array: ");
        printArray(arr);
    }
}
