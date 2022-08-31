package ss10_danh_sach.bai_tap.BaiTapThem;

public class GiangVien extends QuanLy {
//    lop con
    private String chuyenMon;

    public GiangVien(){

    }

    public GiangVien(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public GiangVien(String ma, String ten, String ngaySinh, String gioiTinh, String chuyenMon) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return "GiangVien{" +super.toString()+
                "chuyenMon='" + chuyenMon + '\'' +
                '}';
    }
}
