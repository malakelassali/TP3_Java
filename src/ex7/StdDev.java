package ex7;

public class StdDev {
    public static double stdev(int[] arr) {
        double sum= 0;
        for (int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        double avg= sum/ arr.length;
        double num= 0;
        for (int i=0; i<arr.length; i++){
            num+= Math.pow(arr[i] - avg, 2);
        }
        num/=arr.length-1;
        num= Math.sqrt(num);
        return num;
    }

    public static void main(String[] args) {
        int[] arr= {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(stdev(arr));
    }
}
