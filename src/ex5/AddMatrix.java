package ex5;
import ex3.JaggedArray;

public class AddMatrix {
    public static int[][] matrixAdd(int[][] A, int[][] B) {
        int[][] C= new int[A.length][A[0].length];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int[][] result = matrixAdd(A, B);
        JaggedArray.printMatrix(result);
    }
}
