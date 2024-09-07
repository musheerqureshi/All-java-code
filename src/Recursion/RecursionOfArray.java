package Recursion;

public class RecursionOfArray {

    static void printArray(int[] arr , int index) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArray(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8};
        printArray(arr, 0);
    }
}
