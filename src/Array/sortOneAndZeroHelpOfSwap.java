package Array;

import java.util.Scanner;

public class sortOneAndZeroHelpOfSwap {

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

     }

    static void sort(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;

            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }

    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:" );
        printArray(arr);
        sort(arr);

        System.out.println("Sorted array : ");
        printArray(arr);

    }
}
