package Array;

class Sum{
    public void AddOfArray(){
        int [] arr = {3,3,5,2,6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            System.out.println(sum);
        }
    }

}

public class SumOfArray {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.AddOfArray();

    }
}
