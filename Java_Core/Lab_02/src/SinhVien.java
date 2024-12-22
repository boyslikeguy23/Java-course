import java.util.Scanner;

class SinhVien {
    private String ten;
    private String maSV;
    private static float diemLT;
    private static float diemTH;

    public float diemTrungBinh(){
        return (diemLT+diemTH)/2;
    }
    // Phương thức để xếp loại sinh viên
    public String xepLoai() {
        if (diemLT < 4) {
            return "Thi lại lí thuyết";
        } else if (diemTH < 4) {
            return "Thi lại thực hành";
        } else if (diemTrungBinh() < 4) {
            return "Sinh viên phải học lại";
        } else if (7 >= diemTrungBinh() && diemTrungBinh() >= 4){
            return "Sinh viên đạt môn Java";
        } else {
            return "Sinh viên đạt xuất sắc môn Java";
        }
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        maSV = sc.nextLine();
        System.out.println("Nhập điểm lí thuyết: ");
        diemLT = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        diemTH = sc.nextFloat();

    }

    // Phương thức để hiển thị thông tin sinh viên
    public void hienThiThongTin() {
        System.out.println("Tên sinh viên: " + ten);
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Điểm lý thuyết: " + diemLT);
        System.out.println("Điểm thực hành: " + diemTH);
        System.out.println("Xếp loại: " + xepLoai());
    }
}




