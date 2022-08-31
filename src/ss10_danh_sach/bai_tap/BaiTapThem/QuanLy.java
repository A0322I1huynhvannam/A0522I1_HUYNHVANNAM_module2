package ss10_danh_sach.bai_tap.BaiTapThem;

public abstract class QuanLy {
//    lop cha
    private String Ma;
    private String Ten;
    private String ngaySinh;
    private String gioiTinh;

    public QuanLy(){

    }

    public QuanLy(String ma, String ten, String ngaySinh, String gioiTinh) {
        Ma = ma;
        Ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "QuanLy{" +
                "Ma='" + Ma + '\'' +
                ", Ten='" + Ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }
}
