package Recursion;

public class SubsetSum {

    static void subsetsSum(int[] arr, int n, int idx, int sum){
        if (idx >= n){
            System.out.println(sum);
            return;
        }
        subsetsSum(arr, n, idx+1, sum+arr[idx]);
        subsetsSum(arr, n, idx+1, sum);
    }

    public static void main(String[] args) {
         int[] arr = {2,4,5};
         subsetsSum(arr, arr.length, 0, 0);
    }
}
