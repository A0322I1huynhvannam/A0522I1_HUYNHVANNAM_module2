package ss17_serialization.bai_tap;

import java.io.Serializable;

public class SanPham implements Serializable {
    int maSanPham;
    String tenSanPham;
    String hanSanXuat;
    int gia;
    String cacMoTaKhac;


    public SanPham(int maSanPham, String tenSanPham, String hanSanXuat, int gia, String cacMoTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hanSanXuat = hanSanXuat;
        this.gia = gia;
        this.cacMoTaKhac = cacMoTaKhac;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHanSanXuat() {
        return hanSanXuat;
    }

    public void setHanSanXuat(String hanSanXuat) {
        this.hanSanXuat = hanSanXuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getCacMoTaKhac() {
        return cacMoTaKhac;
    }

    public void setCacMoTaKhac(String cacMoTaKhac) {
        this.cacMoTaKhac = cacMoTaKhac;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hanSanXuat='" + hanSanXuat + '\'' +
                ", gia=" + gia +
                ", cacMoTaKhac='" + cacMoTaKhac + '\'' +
                '}';
    }
}
