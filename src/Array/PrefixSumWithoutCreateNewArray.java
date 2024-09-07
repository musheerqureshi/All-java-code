package Array;

import java.util.Scanner;

public class PrefixSumWithoutCreateNewArray {

    static int[] MakePrefixArray(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array:");
        printArray(arr);

        System.out.println("Output array:");
        int[] prefix = MakePrefixArray(arr);
        printArray(prefix);

    }
}
