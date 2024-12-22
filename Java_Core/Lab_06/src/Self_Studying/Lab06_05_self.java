package Self_Studying;

import java.util.Random;

public class Lab06_05_self {
    public static boolean isPrime(int num) {
        // Số nhỏ hơn 2 không phải là số nguyên tố
        if (num < 2) {
            return false;
        }
        // Kiểm tra xem num có ước nào ngoài 1 và chính nó không
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(20) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\nPrime numbers are: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
