import Array.MulDMatrix;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix1 ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        MulDMatrix mat1 = new MulDMatrix(r, c);
        MulDMatrix mat2;
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        mat1.updateMatrix(matrix);
        mat1.printTranspose();
//        System.out.println("Give another Matrix");
//        int[][] matrix1 = new int[r][c];
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                matrix1[i][j] = sc.nextInt();
//            }
//        }
//        mat2.updateMatrix(matrix1);
//        mat1.printMatrix();
//        mat2.printMatrix();
//        MulDMatrix mat3 = mat1.getSumMatrix(mat2);
//        mat3.printMatrix();
    }
}