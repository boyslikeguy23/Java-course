import java.util.Date;

public class HoaDonBanhMy {
    /*
     * Thuộc tính
     */
    private String maHoaDon;
    private String ngayLapHoaDon;
    private String tenKhachHang;
    private String diaChiKhach;
    private int soLuongBanh;
    private double donGia;
    private double tongTienHang;
    private double tienKhuyenMai;
    private double tongTienThanhToan;

    public HoaDonBanhMy(String maHoaDon, String ngayLapHoaDon, String tenKhachHang, String diaChiKhach, int soLuongBanh, double giaBanh) {
        this.maHoaDon = maHoaDon;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.diaChiKhach = diaChiKhach;
        this.soLuongBanh = soLuongBanh;
        this.donGia = giaBanh;
        this.tinhTongTienHang();
        this.tinhTienKmai();
        this.tinhTongTienThanhToan();
    }

    private void tinhTongTienHang()
    {
        this.tongTienHang = this.soLuongBanh * this.donGia;
    }

    /**
     * Hàm
     * @return
     */
    public void tinhTienKmai(){
        if(this.soLuongBanh >= 10 && this.soLuongBanh <= 99)
        {
            this.tienKhuyenMai=this.donGia*0.1*this.soLuongBanh;
        } else if (soLuongBanh >= 100) {
            this.tienKhuyenMai=this.tongTienHang *0.2;
        }
        else{
            this.tienKhuyenMai=0;
        }
    }

    private void tinhTongTienThanhToan()
    {
        this.tongTienThanhToan = this.tongTienHang - this.tienKhuyenMai;
    }

    public void inHoaDon() {
        System.out.println("Mã Hóa Đơn: " + this.maHoaDon);
        System.out.println("Ngày Lập Hóa Đơn: " + this.ngayLapHoaDon);
        System.out.println("Tên Khách Hàng: " + this.tenKhachHang);
        System.out.println("Địa Chỉ Khách: " + this.diaChiKhach);
        System.out.println("Số Lượng Bánh: " + this.soLuongBanh);
        System.out.println("Giá Bán 1 Chiếc Bánh: " + this.donGia);
        System.out.println("Tổng Tiền Hàng: " + this.tongTienHang);
        System.out.println("Tiền Khuyến Mãi: " + this.tienKhuyenMai);
        System.out.println("Tổng Tiền Phải Thanh Toán: " + this.tongTienThanhToan);
    }

}
