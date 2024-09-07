package Array2D;

public class MultiDimensionalArray {
  static void printArray(int[][] arr){
      for (int i = 0; i < arr.length; i++){
          for (int j = 0; j < arr[i].length; j++){
              System.out.println(arr[i][j] + " ");
          }
          System.out.println();
      }
  }

    public static void main(String[] args) {
        int[][] arr2 = { {1,2,3},
                         {4,5,6},
                         {7,8,9}
        };
        printArray(arr2);

    }
}

