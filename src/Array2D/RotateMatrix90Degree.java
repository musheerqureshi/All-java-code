package Array2D;

import java.util.Scanner;

public class RotateMatrix90Degree {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    static int[][] transposeInPlace(int[][] matrix, int r, int c){
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateMatrix(int[][] matrix, int r, int c){
        // we need transpose for ratate matrix
        // and reverse each rows
        // arr[i] = rows
        transposeInPlace(matrix, r, c);
        for (int i = 0; i < matrix.length; i++){
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElemesnts = r * c;

        System.out.println("Enter " + totalElemesnts + " values");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Rotate of Matrix");
        rotateMatrix(matrix, r, c);
        printMatrix(matrix);

    }
}
