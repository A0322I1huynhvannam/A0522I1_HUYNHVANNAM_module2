package ss10_danh_sach.bai_tap.bai_tap_them_2;

public class XeMay extends QuanLyXe {
    private String congSuat;

    public XeMay(){

    }

    public XeMay(String congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +super.toString()+
                "congSuat='" + congSuat + '\'' +
                '}';
    }
}
