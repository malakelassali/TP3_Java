package ex3;
import ex2.ArrayReverse;

public class JaggedArray {
    public static int[][] jaggedArray(int start, int increment) {
        int[][] jagged= new int[5][];
        int value= start;
        for (int i = 0; i<5; i++){
            jagged[i]= new int[i+1];
            for (int j=0; j<i+1; j++) {
                jagged[i][j] = value;
                value+= increment;
            }
        }
        return jagged;
    }

    public static void main(String[] args) {
        int[][] result= jaggedArray(1, 1);
        for (int i = 0; i<5; i++){
            ex2.ArrayReverse.printArray(result[i]);
        }
    }
}
