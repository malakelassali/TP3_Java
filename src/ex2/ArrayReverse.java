package ex2;

public class ArrayReverse {
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i<arr.length; i ++) {
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(", ");
        }
        System.out.println("]");
    }


    public static void reverse(int[] arr) {
        printArray(arr);
        int[] reversed= new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }
        printArray(reversed);
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        reverse(arr);
    }
}
