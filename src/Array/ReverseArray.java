package Array;

public class ReverseArray {

    static int[] ArrayReverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-1; i >= 0; i--){
            ans[j++] = arr[i];

        }
        return ans;
    }

    // Method
    /**
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
     **/


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = ArrayReverse(arr);
        // Method call
        // printArray(ans);
        for (int i = 0; i < arr.length; i++){
            System.out.println(ans[i] + " ");
        }


    }
}
