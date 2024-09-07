package Array2D;

import java.util.Scanner;

public class SpiralMatrix {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftColumn = 0, rightColumn = c-1;
        int totalElements = 0;
        while (totalElements < r*c){
            //topRow -> leftcolumn to rightcolumn
            for (int j = leftColumn; j <= rightColumn && totalElements < r*c; j++){
                System.out.println(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightcoulmn -> topRow to BottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r*c; i++){
                System.out.println(matrix[i][rightColumn] + " ");
                totalElements++;
            }
            rightColumn--;

            // bottomRow -> rightColumn to leftColumn
            for (int j = rightColumn; j >= leftColumn && totalElements < r*c; j--){
                System.out.println(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftcolumn -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r*c; i--){
                System.out.println(matrix[i][leftColumn]);
                totalElements++;
            }
            leftColumn++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number of rows and coulmns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r*c;

        System.out.println("Enter " + total + " values");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println("Input Matrix");
            printMatrix(matrix);

            System.out.println("Spiral Order");
            printSpiralOrder(matrix, r, c);

        }


    }
}
