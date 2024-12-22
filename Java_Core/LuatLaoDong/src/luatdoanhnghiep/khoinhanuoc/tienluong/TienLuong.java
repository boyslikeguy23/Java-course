package luatdoanhnghiep.khoinhanuoc.tienluong;

public class TienLuong {
    public static final float BAC_TRUNG_CAP = 1.55f;
    public static final float BAC_CAO_DANG = 1.80f;
    public static final float BAC_DAI_HOC = 2.34f;

    public static final double LUONG_CO_BAN = 2889000;
    public static final float HE_SO_BHXH = 16;
    public static final float HE_SO_THAM_NIEN = 5;

    /**
     * Hàm tính lương cơ bản
     * @param hocVi gồm 3 cấp độ học vị sẵn có
     * @param namCongTac số năm nhân viên đã công tác tại doanh nghiệp
     * @return tiền lương cơ bản
     */
    public static double luongCoBan(float hocVi, int namCongTac){
        double luongCoBan = (hocVi * LUONG_CO_BAN) + namCongTac *(5/100*LUONG_CO_BAN);
        return luongCoBan;
    }

    /**
     *
     * @param luong Số tiền luognw nhận được
     * @return
     */
    public static double soTienBaoHiem(double luong){
        return(HE_SO_BHXH/100) * luong;
    }

}
