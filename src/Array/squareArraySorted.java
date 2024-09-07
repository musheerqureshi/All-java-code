package Array;

import java.util.Scanner;

public class squareArraySorted {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] SqareArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }

        }
        return ans;
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array elements:");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println(" Enter " + n + " elements:");
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Original array:");
            printArray(arr);
            int[] ans = SqareArray(arr);

            System.out.println("Sorted array:");
            reverse(ans);
            printArray(ans);


        }
}

