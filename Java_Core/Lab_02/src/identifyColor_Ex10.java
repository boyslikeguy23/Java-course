import java.util.Scanner;

public class identifyColor_Ex10 {
    char color;
    public static char input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập màu sắc: ");
        char color = sc.next().charAt(0);
        return color;
    }
    public void identifyColor(){
        System.out.println("Nhập màu sắc để xác định: ");
        color = input();
        if(color == 'R' || color == 'r') {
            System.out.println("Màu đỏ");
        } else if(color == 'G' || color == 'g') {
            System.out.println("Màu xanh lá cây");
        } else if(color == 'B' || color == 'b') {
            System.out.println("Màu xanh dương");
        } else {
            System.out.println("Màu không hợp lệ! Vui lòng nhập R, G, B, Y, O hoặc P.");
        }
    }
}
