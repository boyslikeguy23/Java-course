public class NhanVienMainClass {
    public static void main(String[] args) {
        NhanVien[] arrNhanVien = new NhanVien[3];
        //Nhan vien 1
        arrNhanVien[0] = new NhanVien();
        arrNhanVien[0].name = "Ngoc Khanh";
        arrNhanVien[0].cnt++;
        //Nhan vien 2
        arrNhanVien[1] = new NhanVien();
        arrNhanVien[1].name = "Ba Tung";
        arrNhanVien[1].cnt++;
        //Nhan vien 3
        arrNhanVien[2] = new NhanVien();
        arrNhanVien[2].name = "Kieu Max";
        arrNhanVien[2].cnt++;

        for (int i = 0; i < arrNhanVien.length; i++) {
            NhanVien nhanVien = arrNhanVien[i];
            System.out.println(nhanVien.name + " cnt = " + nhanVien.cnt);
        }
    }
}
