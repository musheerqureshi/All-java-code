package Recursion;

public class SearchIndex {

    static boolean Search(int[] arr, int target, int index){
        int n = arr.length;
        if (index >= n){
            return false;
        }
        if (arr[index] == target){
            return true;
        }
        return Search(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 6, 8, 9};
        int target = 6;
        if (Search(arr, target, 0)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
