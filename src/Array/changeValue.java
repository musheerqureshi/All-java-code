package Array;

public class changeValue {

    public static void change_val(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr [0] = 4;
        arr [1] = 5;
        arr [2] = 6;

        change_val(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
