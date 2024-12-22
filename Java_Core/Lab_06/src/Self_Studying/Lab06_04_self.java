package Self_Studying;

import java.util.Random;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Lab06_04_self {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int min=arr[0], max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            System.out.println("Min is: " + min);
            System.out.println("Max is: " + max);

    }
}
