import java.util.Scanner;

public class XeMay {
    private String ten;
    private String nhaSanXuat;
    private int soLuongBanhXe;

    public void nhapThongTin()
    {
        System.out.println("Chào mừng đến với cổng nhập thông tin xe của bạn!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên dòng xe máy: ");
        ten = sc.nextLine();
        System.out.println("Nhà sản xuất xe: ");
        nhaSanXuat = sc.nextLine();
        System.out.println("Số lượng bánh: ");
        soLuongBanhXe = sc.nextInt();
        System.out.println("Nhập thông tin thành công!");
    }

    public void hienThiThongTin()
    {
        System.out.println("Thông tin xe của bạn:");
        System.out.println("Tên xe máy: " + ten);
        System.out.println("Nhà sản xuất xe: " + nhaSanXuat);
        System.out.println("Số lượng bánh: " + soLuongBanhXe);
    }
}
