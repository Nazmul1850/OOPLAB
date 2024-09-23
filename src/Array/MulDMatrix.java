package Array;

import java.util.Arrays;

public class MulDMatrix {
    int r;
    int c;
    int [][] matrix;

    public MulDMatrix(int r, int c){
        this.r = r;
        this.c = c;
        matrix = new int[r][c];
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void updateMatrix(int[][] matrix){
          this.matrix = matrix;
    }

    public void printMatrix(){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printTranspose(){
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public MulDMatrix getSumMatrix(MulDMatrix anotherMatrix){
        int r1 = anotherMatrix.r;
        int c1 = anotherMatrix.c;
        if(r != r1 || c != c1){
            System.out.println("Sum not possible");
            return null;
        }
        int[][] sumMatrix = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                sumMatrix[i][j] = matrix[i][j] + anotherMatrix.matrix[i][j];
            }
        }
        MulDMatrix result = new MulDMatrix(r1, c1);
        result.updateMatrix(sumMatrix);
        return result;
    }

    public int getMatrixRange(){
        int max = matrix[0][0];
        int min = matrix[0][0];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
        }
        return max - min;
    }

    public int diagonalSum(){
        int sum = 0;
        if(r != c){
            return -1;
        }
        for(int i = 0; i < r; i++){
            sum += matrix[i][i];
        }
        return sum;
    }
    private int[] singleReverse(int[] array){
        for(int i = 0; i < array.length; i++){
            if(i <= (array.length -1 -i)){
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }

        }
        return array;
    }

    public MulDMatrix rowReverse(){
        MulDMatrix result = new MulDMatrix(r, c);
        int[][] newMatrix = new int[r][c];
        for(int i = 0; i < r; i++){
            newMatrix[i] = singleReverse(matrix[i]);
        }
        result.updateMatrix(newMatrix);
        return result;
    }
}
