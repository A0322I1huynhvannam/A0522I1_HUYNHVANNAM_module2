package ss10_danh_sach.bai_tap.bai_tap_them_2;

public class Oto extends QuanLyXe{
    private String soChoNgoi;
    private String kieuXe;

    public Oto(){

    }

    public Oto(String soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public String getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +super.toString()+
                "soChoNgoi='" + soChoNgoi + '\'' +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
