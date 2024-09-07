package Recursion;

public class findIndex {

    static int fINDINDEX(int[] arr, int target, int index){
        int n = arr.length;
        if (index >= n){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return fINDINDEX(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {4,7,6,2,5,8};
        int target = 9;
        System.out.println(fINDINDEX(arr, target, 0));

    }
}
