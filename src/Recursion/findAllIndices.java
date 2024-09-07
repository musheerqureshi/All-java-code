package Recursion;

public class findAllIndices {

    static void Search(int[] arr, int target, int index){
        int n = arr.length;
        if (index >= n){
            return;
        }
        if (arr[index] == target){
            System.out.println(index);
        }
        Search(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,2,5,2,40};
        int target = 2;
        Search(arr, target, 0);
    }
}
