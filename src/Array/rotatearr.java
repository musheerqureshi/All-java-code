package Array;

import java.util.Scanner;

public class rotatearr {

    static int[] Rotate(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-1; i >= n; i--){
            arr[j++] = arr[i];
        }
        return ans;

    }

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);
        Rotate(arr);

        System.out.println("Sorted array: ");
        printArray(arr);



    }
}
