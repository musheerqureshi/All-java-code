package Array;

import java.util.Scanner;

public class  PairSum {

    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++){ // loop for first number
            for (int j = i + 1; j < n; j++){ // loop for second number
                if (arr[i] + arr[j] == target){
                   ans++;
                }
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println("Total target sum: " + pairSum(arr, target));
    }
}