package Array;

class Main{
    public void multiArray(){
        int [][] arr = { {56, 43, 6}, {34, 7, 8}, {12, 56, 10} };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}

public class Arrays {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.multiArray();
    }
}
