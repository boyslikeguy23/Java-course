import java.util.Scanner;

public class DuBaoThoiTiet{
    int status;

    public static void main(String[] args) {
        DuBaoThoiTiet duBao = new DuBaoThoiTiet();
        duBao.nhapDuLieu();
        duBao.hienThiDuBao();
    }

    public void nhapDuLieu(){
        System.out.println("Chương trình dự báo thời tiết Chuồn Chuồn");
        System.out.println("1. Bay thấp");
        System.out.println("2. Bay cao");
        System.out.println("3. Bay vừa");
        System.out.println("4. Say rượu cmn rồi!");
        System.out.println("Mời nhập từ 1->4");

        Scanner input = new Scanner(System.in);
        status = input.nextInt();
        System.out.println("Cảm ơn đã nhập!");
    }

    public void hienThiDuBao(){
        switch(status)
        {
            case 1:
                System.out.println("Dự báo: Mưa, khi ra khỏi nhà nhớ mang áo mưa");
                break;
            case 2:
                System.out.println("Dự báo: Nắng, khi ra khỏi nhà nhớ mang kính râm");
                break;
            case 3:
                System.out.println("Dự báo: Mát mẻ, thời tiết rất dễ chịu");
                break;
            case 4:
                System.out.println("Dự báo: Say rượu, không nên ra khỏi nhà!");
                break;
            default:
                System.out.println("Chuồn chuồn thử *beep* 404 lần nhưng không có kết quả");
                break;
        }
    }
}