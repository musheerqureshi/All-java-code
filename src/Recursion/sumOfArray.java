package Recursion;

public class sumOfArray {

    static int Sum(int[] arr, int index){
        if (index == arr.length){
            return 0;
        }

       // System.out.println(arr[index]);
        int smallAns = Sum(arr, index+1);
        return  smallAns + arr[index];
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        System.out.println(Sum(arr, 0));
    }
}
