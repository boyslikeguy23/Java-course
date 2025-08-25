package BaiThucHanh05;

import java.util.Scanner;

public class BaiThucHanh05 {
    private static final String[] DIGIT = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

    public static String docSo(double num){
        int integerPart = (int) num;
        int fractionalPart = (int) Math.round((num - integerPart) * 100);
        StringBuilder result = new StringBuilder();
        result.append(readIntegerPart(integerPart));
        if(fractionalPart  > 0){
            result.append(" phẩy ");
            if(fractionalPart < 10) result.append(DIGIT[0]).append(" ");
            result.append(readIntegerPart(fractionalPart));
        }
    return result.toString().trim();}

    public static String readIntegerPart(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) return DIGIT[0];
        if (num == 100) return "một trăm";
        if (num < 10) return DIGIT[num];
        if (num < 20) return "mười " + (num % 10 == 5 ? "lăm" : DIGIT[num % 10]);
        if (num < 100) {
            int tens = num / 10;
            int units = num % 10;
            sb.append(DIGIT[tens]).append(" mươi");
            if (units == 1) sb.append(" mốt");
            else if (units == 5) sb.append(" lăm");
            else if (units == 4) sb.append(" tư");
            else if (units > 1) sb.append(" ").append(DIGIT[units]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BaiThucHanh05 bth = new BaiThucHanh05();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thực dương (có thể có phần thập phân): ");
        double number = sc.nextDouble();
        if (number < 0 || number > 100) {
            throw new IllegalArgumentException("Số nhập vào phải là số thực dương và không vượt quá 100.");
        }
        String result = bth.docSo(number);
        System.out.println("Số " + number + " đọc là: " + result);
    }
}
