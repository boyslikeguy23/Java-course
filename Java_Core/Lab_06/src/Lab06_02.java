import java.util.Scanner;

public class Lab06_02 {
    String arrNhanVien[][] = new String[3][2];
    public static void main(String[] args) {
        Lab06_02 lab06 = new Lab06_02();
        lab06.nhapDuLieu();
        lab06.sapXep();
        lab06.hienThi();
    }

    public void nhapDuLieu(){
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println("Nhap thong tin cho nhan vien thu " + (i+1));
            Scanner sc = new Scanner(System.in);
            arrNhanVien[i][0] = sc.nextLine();
            arrNhanVien[i][1] = sc.nextLine();
        }
        System.out.println("Nhap thanh cong!");
    }

    public void sapXep(){
       for(int i = 0; i< arrNhanVien.length - 1; i++)
           for (int j = i + 1; j < arrNhanVien.length; j++)
           {
               if(Float.parseFloat(arrNhanVien[j][1]) < Float.parseFloat(arrNhanVien[i][1])){
                   String temp[][] = new String[1][2];

                   //Doi cho
                   temp[0][0] = arrNhanVien[j][0];
                   temp[0][1] = arrNhanVien[j][1];

                   arrNhanVien[j][0] = arrNhanVien[i][0];
                   arrNhanVien[j][1] = arrNhanVien[i][1];

                   arrNhanVien[i][0] = temp[0][0];
                   arrNhanVien[i][1] = temp[0][1];
               }
           }

    }

    //Hiển thị
    public void hienThi(){
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println(arrNhanVien[i][0] + " - " + arrNhanVien[i][1]);
        }
    }
}
