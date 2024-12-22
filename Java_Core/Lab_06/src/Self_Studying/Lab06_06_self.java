package Self_Studying;

import java.util.Random;

public class Lab06_06_self {
    public static boolean isPerfect(int num) {
        if (num < 1) {
            return false;
        }

        int sum = 0;

        // Tính tổng các ước số nhỏ hơn num
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Nếu tổng các ước bằng chính nó thì là số hoàn hảo
        return sum == num;
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
        System.out.print("\nPerfect numbers are: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPerfect(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
