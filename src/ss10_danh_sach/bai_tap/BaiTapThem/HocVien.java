package ss10_danh_sach.bai_tap.BaiTapThem;

public class HocVien extends QuanLy {
//    lop con
    private String diemSo;

    public HocVien(){

    }

    public HocVien(String diemSo) {
        this.diemSo = diemSo;
    }

    public HocVien(String ma, String ten, String ngaySinh, String gioiTinh, String diemSo) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.diemSo = diemSo;
    }

    public String getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(String diemSo) {
        this.diemSo = diemSo;
    }

    @Override
    public String toString() {
        return "HocVien{" + super.toString()+
                "diemSo='" + diemSo + '\'' +
                '}';
    }
}
