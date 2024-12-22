package BaiThucHanh05;

public class BaiThucHanh05 {
    public void docSo(double soThapPhan){
        if(soThapPhan<20){
            phatAmSo((int)soThapPhan);

        }else if (soThapPhan>=20 && soThapPhan<100){
            phatAmSo((int)soThapPhan/10);
            System.out.println("mươi");
        }
    }

    public void number4Text(double number){
        double phanDu = number;
        do{
            phanDu = number % 10;
            double thapPhan = number - phanDu;
            System.out.println("Phần dư: " + thapPhan);
            System.out.println("Thập phân: " + thapPhan);
            docSo(thapPhan);
        }while(phanDu > 10);
        if(phanDu > 0){
            System.out.print(" ");
            phatAmSo((int)phanDu);
            System.out.print("\n");
        }
    }
    public void phatAmSo(int so){
        switch(so){
            case 0:
                System.out.print("khong");
            case 1:
                System.out.print("một");
            case 2:
                System.out.print("hai");
            case 3:
                System.out.print("ba");
            case 4:
                System.out.print("bốn");
            case 5:
                System.out.print("năm");
            case 6:
                System.out.print("sáu");
            case 7:
                System.out.print("bảy");
                case 8:
                System.out.print("tám");
                case 9:
                System.out.print("chín");


        }
    }

    public static void main(String[] args) {
        BaiThucHanh05 bth = new BaiThucHanh05();
        bth.docSo(10);
    }
}
