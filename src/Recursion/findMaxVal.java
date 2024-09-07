package Recursion;

import javax.crypto.spec.PSource;

public class findMaxVal {

    static int findMax(int[] arr, int index){
        int mx = 0;
        if (index == arr.length-1) {
            return arr[index];
        }

        int smallAns = findMax(arr, index+1);

        return Math.max(arr[index], smallAns);
    }



    public static void main(String[] args) {
        int[] arr = {3,5,2,1,7,9,8};
        System.out.println(findMax(arr, 0));

    }
}
