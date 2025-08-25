package BaiThucHanh05;

import java.util.Random;

public class Lab03_Prac_04 {
    public static void findNumberDivisibleBy3(int[] n){
        int count = 0;
        System.out.print("Các số chia hết cho 3 trong mảng là: ");
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 3 == 0) {
                System.out.print(n[i] + " ");
                count++;
            }
            if(count == 10){
                System.out.println("\nĐã tìm thấy 10 số chia hết cho 3, dừng lại.");
                break;
            }
        }
        if(count == 0){
            System.out.println("Không có số nào chia hết cho 3 trong mảng.");
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[1000]; // Tạo mảng có kích thước ngẫu nhiên từ 1 đến 20
        for (int i = 0; i < 999; i++) {
            arr[i] = random.nextInt(1000)  ;
            // nextInt(n) trả số từ 0 đến n-1, nên cần cộng min
        }
        findNumberDivisibleBy3(arr);
    }
}
