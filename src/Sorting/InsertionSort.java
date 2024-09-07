package Sorting;

public class InsertionSort {

    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,3,5,1,7,2};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
