package Array;

import javax.crypto.SealedObject;

class Algebra{
    public void SearchArray(){
        int [] arr = new int[5];
        arr [0] = 34;
        arr [1] = 33;
        arr [2] = 54;
        arr [3] = 67;
        arr [4] = 12;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // for each loop
        for (int ar : arr){
            System.out.println(ar);
        }
    }

}
public class Array {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        obj.SearchArray();

    }
}
