package learning;

public class fff {

    static void printArray(int arr[] , int index){
        if (index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2};
        printArray(arr, 0);
    }
}
