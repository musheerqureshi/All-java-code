package learning;

public class findMaximum {

    static int findMx(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > j) {
                j = arr[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
         int[] arr = {3, 6, 2, 7, 8, 4};
         int ans = findMx(arr);
        System.out.println("The maximum number in the array is :" + ans);
    }
}
