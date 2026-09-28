package ex1;

public class ArraySort {
    public static void printArray(int[] arr) {
        for (int i=0; i < arr.length; i ++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] sortIntegers(int[] arr) {
        int[] sortedArray= new int[arr.length];
        for (int i=0; i < arr.length; i++) {
            sortedArray[i] = arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            int j= i;
            while (j > 0 && sortedArray[j] > sortedArray[j-1]) {
                swap(sortedArray, j, j-1);
                j--;
            }

        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] arr= {106, 26, 81, 5, 15, 130};
        printArray(arr);
    System.out.println("Sorted Array: ");
        printArray(sortIntegers(arr));
    }
}
