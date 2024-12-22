package Self_Studying;

import java.util.Random;
import java.util.Scanner;

public class Lab06_03_self {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
