package thi.models;

public abstract class NganHang {
    private String iDTaiKhoan;
    private String maTaiKhoan;
    private String tenChuTaiKhoan;
    private String ngayTaoTaiKhoan;

    public NganHang(String iDNganHang, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan) {
        this.iDTaiKhoan = iDNganHang;
        this.maTaiKhoan = maTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    protected NganHang() {
    }

    public static void setiDTaiKhoan(int i) {
    }

    public String getiDTaiKhoan() {
        return iDTaiKhoan;
    }

    public void setiDNganHang(String iDNganHang) {
        this.iDTaiKhoan = iDNganHang;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public String getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(String ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    @Override
    public String toString() {
        return "NganHang{" +
                "iDNganHang='" + iDTaiKhoan + '\'' +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenChuTaiKhoan='" + tenChuTaiKhoan + '\'' +
                ", ngayTaoTaiKhoan='" + ngayTaoTaiKhoan + '\'' +
                '}';
    }
    public String toData(){
        return String.format("%s,%s,%s,%s",iDTaiKhoan,maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan);
    }
}
