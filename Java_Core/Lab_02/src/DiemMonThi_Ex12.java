import java.util.Scanner;

public class DiemMonThi_Ex12 {
    double toan, ly, hoa;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm Toán: ");
        toan = sc.nextDouble();
        System.out.println("Nhập điểm Lý: ");
        ly = sc.nextDouble();
        System.out.println("Nhập điểm Hóa: ");
        hoa = sc.nextDouble();

    }
    public void printComment(){
        double allScore = toan + ly + hoa;
        if(allScore >- 15 && toan >=4 &&ly >=4 && hoa >=4){
            System.out.println("Bạn đã đậu!");
            if(toan >=5 &&ly >=5 && hoa >=5){
                System.out.println("Học đều các môn!");
            }else {
                System.out.println("Học chưa đều các môn!");
            }
        } else System.out.println("Bạn đã rớt!");
    }
    public static void main(String[] args) {
        DiemMonThi_Ex12 diemMonThi = new DiemMonThi_Ex12();
        diemMonThi.input();
        diemMonThi.printComment();
    }
}
