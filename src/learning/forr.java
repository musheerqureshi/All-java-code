package learning;

public class forr {

    static void buuble(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,3,6,2,8,7,1,5};
        buuble(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
