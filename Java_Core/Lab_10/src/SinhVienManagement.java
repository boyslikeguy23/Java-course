import java.util.Arrays;

public class SinhVienManagement {
    String[] arrSinhVien;
    public SinhVienManagement(){
        arrSinhVien = new String[0];
    }
    public void moRong(){
        int size = arrSinhVien.length + 1;
        String[] temp = Arrays.copyOf(arrSinhVien, size);
        arrSinhVien = new String[size];
        System.arraycopy(temp, 0, arrSinhVien, 0, size);
    }

    public void themSinhVien(String name, int pos){
        try{
            arrSinhVien[pos - 1] = name;
        }catch (ArrayIndexOutOfBoundsException e){
            moRong();
            arrSinhVien[arrSinhVien.length-1] = name;
        }
    }

    public void hienThi(){
        for(int i = 0; i < arrSinhVien.length; i++){
            String arrSinhVie1 = arrSinhVien[i];
            System.out.println(arrSinhVien[i]);
        }
    }

    //Test
    public static void main(String[] args){
        SinhVienManagement sm = new SinhVienManagement();
        sm.themSinhVien("Dev", 6);
        sm.hienThi();
    }
}
