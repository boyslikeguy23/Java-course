import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Person person_01 = new Person();
//        person_01.input();
//        person_01.view();
//        XeMay may_01 = new XeMay();
//        may_01.nhapThongTin();;
//        may_01.hienThiThongTin();
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        sv.hienThiThongTin();

        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Tạo đối tượng PhuongTrinhBacHai và giải phương trình
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai(a, b, c);
        pt.giaiPhuongTrinh();

        scanner.close();

    }
}