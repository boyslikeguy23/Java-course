import java.util.Scanner;

public class Ex14 {
    private int oldIndex;
    private int newIndex;
    private static final int BASE_PRICE = 1000;
    private static final int LIMIT_KV = 50;

    public void input(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập chỉ số cũ: ");
            oldIndex = sc.nextInt();
            System.out.println("Nhập chỉ số mới: ");
            newIndex = sc.nextInt();
            if (oldIndex < 0 || newIndex < 0) {
                System.out.println("Chỉ số không hợp lệ! Vui lòng nhập lại.");
                input(); // Gọi lại hàm input để nhập lại
            }
        }while(newIndex < oldIndex);
    }
    public int getUsedKW() {
        return newIndex - oldIndex;
    }

    public int calcLimitPrice() {
        int used = getUsedKW();
        return Math.min(used, LIMIT_KV) * 230;
    }

    public int calcOverLimitPrice() {
        int used = getUsedKW();
        int over = used - LIMIT_KV;
        if (over <= 0) return 0;

        if (over <= 50) {
            return over * 480;
        } else if (over <= 100) {
            return over * 700;
        } else {
            return over * 900;
        }
    }

    public int calcTotal() {
        return BASE_PRICE + calcLimitPrice() + calcOverLimitPrice();
    }

    public void printBill() {
        System.out.println("\n--- HÓA ĐƠN TIỀN ĐIỆN ---");
        System.out.println("Chỉ số cũ: " + oldIndex);
        System.out.println("Chỉ số mới: " + newIndex);
        System.out.println("Tiền định mức: " + calcLimitPrice() + "đ");
        System.out.println("Tiền vượt định mức: " + calcOverLimitPrice() + "đ");
        System.out.println("Tiền thuê bao: " + BASE_PRICE + "đ");
        System.out.println("Tổng tiền phải trả: " + calcTotal() + "đ");
    }

    public static void main(String[] args) {
        Ex14 bill = new Ex14();
        bill.input();
        bill.printBill();
    }
}
