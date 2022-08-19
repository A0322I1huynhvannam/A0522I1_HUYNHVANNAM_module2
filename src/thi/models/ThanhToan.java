package thi.models;

public class ThanhToan extends NganHang {
    private String soThe;
    private String soTienTrongThe;
//    public ThanhToan(String i,String soThe, String soTienTrongThe, String ngayTaoTaiKhoan, String the, String tienTrongThe){
//        this.soThe = soThe;
//        this.soTienTrongThe = soTienTrongThe;
    public ThanhToan(String soTienGui, String ngayGui, String laiSuat, String kiHan, String iDNganHang, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan){
        super(iDNganHang, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongThe = soTienTrongThe;
    }

    public ThanhToan(int i, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soThe, String soTienTrongThe) {
        this.soThe = soThe;
        this.soTienTrongThe = soTienTrongThe;
    }

    @Override
    public String toString() {
        super.toString();
        return "ThanhToan{" +
                "soThe='" + soThe + '\'' +
                ", soTienTrongThe='" + soTienTrongThe + '\'' +
                '}';



    }
    public String toData(){
        return String.format("%s,%s,%s,%s,%s,%s",soThe,soTienTrongThe);
    }
}

