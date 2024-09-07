package Array;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class PrefixSum {

    static int[] PrefixSumArray(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + "" );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array:");
        printArray(arr);

        System.out.println("Output array:");
         int[] prefix = PrefixSumArray(arr);
        printArray(prefix);
    }
}
