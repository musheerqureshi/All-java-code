package Array2D;

import java.util.Scanner;

public class MatrixSum {

    static void printMarix(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Add(int[][] a, int r1, int r2, int[][] b, int c1, int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Additional not possible");
            return;
        }

        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMarix(sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows and coulumns matrix: 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix values");
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and coulumns matrix: 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter matrix values");
        for (int i = 0; i < r2; i++){
            for (int j = 0; j < c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMarix(a);
        System.out.println("Matrix 2");
        printMarix(b);
        System.out.println("Sum of matrix 1 and matrix 2");
        Add(a, r1, r2, b, c1, c2);
    }
}
