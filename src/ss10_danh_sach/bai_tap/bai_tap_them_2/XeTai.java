package ss10_danh_sach.bai_tap.bai_tap_them_2;

public class XeTai extends QuanLyXe{
    private String trongTai;

    public XeTai(){

    }

    public XeTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +super.toString()+
                "trongTai='" + trongTai + '\'' +
                '}';
    }
}
