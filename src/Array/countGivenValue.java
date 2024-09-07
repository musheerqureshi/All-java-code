package Array;

import java.util.Scanner;

public class countGivenValue {

    // this is for find the last index occurence
    /**
    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
     **/
    public static int countOfOccurrence(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x = sc.nextInt();

        System.out.println("COUNT OF X: " + countOfOccurrence(arr, x));
        /**
        System.out.println("LAST OCCURRENCE OF X: " + lastOccurrence(arr, x));
         **/
    }
}

