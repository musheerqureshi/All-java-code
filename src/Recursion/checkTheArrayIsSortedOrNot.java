package Recursion;

public class checkTheArrayIsSortedOrNot {
    static boolean SortCheck(int[] arr,  int index){
        int n = arr.length;
        index = 0;
        if (index == arr.length){
            return false;
        }
        if (index == index+1){
            return true;
        }

        return SortCheck(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        SortCheck(arr, 0);
    }
}
