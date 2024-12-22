import java.util.Scanner;

public class QuanLyHoaDon {
    public void nhapThongTinHoaDon()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã hóa đơn: ");
        String maHoaDon = scanner.nextLine();

        System.out.print("Nhập ngày lập hóa đơn: ");
        String ngayLapHoaDon = scanner.nextLine();

        System.out.print("Nhập tên khách hàng: ");
        String tenKhachHang = scanner.nextLine();

        System.out.print("Nhập địa chỉ khách: ");
        String diaChiKhach = scanner.nextLine();

        System.out.print("Nhập số lượng bánh: ");
        int soLuongBanh = scanner.nextInt();

        System.out.print("Nhập giá bán 1 chiếc bánh: ");
        double giaBanh = scanner.nextDouble();

        /*
            Khởi tạo một đối tượng hoaDon rồi truyền những giá trị đã nhập ở trên vào đối tượng để tạo đối tượng
         */
        HoaDonBanhMy hoaDon = new HoaDonBanhMy(maHoaDon, ngayLapHoaDon, tenKhachHang, diaChiKhach, soLuongBanh, giaBanh);
        hoaDon.inHoaDon();
    }
}
