package thi.models;

public class TietKiem extends NganHang {
    private String soTienGui;
    private String ngayGui;
    private String laiSuat;
    private String kiHan;
    public TietKiem(int i, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soTienTietKiem, String ngayGuiTietKiem, String laiSuat, String kiHan){
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiSuat = this.laiSuat;
        this.kiHan = this.kiHan;
    }
    public TietKiem(String soTienGui, String ngayGui, String laiSuat, String kiHan, String iDNganHang, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan){
        super(iDNganHang,maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        super.toString();
        return "TietKiem{" +
                "soTienGui='" + soTienGui + '\'' +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }
    public String toData(){
        return String.format("%s,%s,%s,%s,%s,%s",soTienGui,ngayGui,laiSuat,kiHan);
    }
}
