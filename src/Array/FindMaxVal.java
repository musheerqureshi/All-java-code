package Array;

class FindMax{
    public void MaxVal(){
        int [] arr = {3,5,34, 64,23, 3 ,66};
        int ans = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}


public class FindMaxVal {
    public static void main(String[] args) {
        FindMax obj = new FindMax();
        obj.MaxVal();
    }
}
