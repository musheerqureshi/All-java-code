package Array2D;

import java.util.Scanner;

public class Transpose {

    static void printmatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println();

    }

    static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] ans = new int[r][c];

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix numbers of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;

        System.out.println("Enter " + totalElements + " elements:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printmatrix(matrix);

        System.out.println("Transpose of matrix");
        int[][] ans  = findTranspose(matrix, r, c);
        printmatrix(ans);
    }
}
