package PhanIII.Bai2;

import BaiThucHanh3.DemoJp2Saveobject;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseReader {
    public void ReadDatabase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the database");
        String filePath = sc.nextLine();
        int soNguyen;
        double soThuc;
        boolean giaTriBoolean;
        char kyTu;
        String chuoi;
        System.out.print("Nhập số nguyên: ");
        soNguyen = sc.nextInt();

        System.out.print("Nhập số thực double: ");
        soThuc = sc.nextDouble();

        System.out.print("Nhập giá trị boolean: ");
        giaTriBoolean = sc.nextBoolean();

        System.out.print("Nhập ký tự: ");
        kyTu = sc.next().charAt(0);

        System.out.print("Nhập chuỗi: ");
        sc.nextLine();  // Đọc bỏ dòng trống sau khi nhập ký tự
        chuoi = sc.nextLine();
        try{
            //Ghi xuong file
            FileOutputStream file = new FileOutputStream("data.db");
//            ObjectOutputStream objOut = new ObjectOutputStream(file);;
//            objOut.writeObject(lstNhanVien);
            file.write(soNguyen);
            file.write(doubleToBytes(soThuc));

            // Ghi giá trị boolean
            file.write(giaTriBoolean ? 1 : 0);

            // Ghi ký tự
            file.write((byte) kyTu);

            // Ghi chuỗi
            file.write(chuoi.getBytes());
            objOut.flush(); // Tong bo nho dem xuong tep tin
            objOut.close();
        }catch (Exception e){
            Logger.getLogger(DemoJp2Saveobject.class.getName()).log(Level.SEVERE, null, e);

        }
    }
}
