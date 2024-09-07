package Array;

public class ArraysExample {

    void searchInArray(){
        int[] arr = {10, 6, 4, 6 ,5};
        int x = 5;

        int ans = -1;

        for (int i=0; i<arr.length; i++){
            if (arr[i] ==x){
                ans = i;
            }
        }
        System.out.println("Found at "+ans+" index");
    }


        public static void main(String[] args) {
            ArraysExample obj = new ArraysExample();
            obj.searchInArray();

        }

}
