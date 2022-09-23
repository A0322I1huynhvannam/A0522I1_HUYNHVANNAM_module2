package ss17_serialization.bai_tap;

import ss17_serialization.bai_tap.FileHelperCsV;
import ss17_serialization.bai_tap.SanPham;
import thithuphat1.exception.NotFoundProductException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SanPhamServices implements Serializable {
    private static final long serialVersionUID = 1L;
    private FileHelperCsV fileHelperCsV = new FileHelperCsV();
    private final List<SanPham> sanPhamList = new ArrayList<>();

    private static final String PATH_LAN_2 = "D:\\codegym\\A0522I1huynhvannam\\Module2\\A0522i1_HUYNHVANNAM_module_2\\src\\ss17_serialization\\bai_tap\\nam.dat";

    public void add(SanPham sanPham) {
        int lastID = 0;
        if (sanPhamList.size() > 0) {
            lastID = sanPhamList.get(sanPhamList.size() - 1).getMaSanPham();
        }
        sanPham.setMaSanPham(lastID + 1);
        sanPhamList.add(sanPham);
        fileHelperCsV.writeFile(PATH_LAN_2, sanPhamList);

    }

    public void display() {
        List<SanPham> in = (List<SanPham>) fileHelperCsV.readFile(PATH_LAN_2);
        if (in.isEmpty()) {
            System.out.println("Chưa có danh sách để hiển thị vui lòng nhập danh sách!!!");
        }
        in.forEach(System.out::println);
    }

    public void timKiem(String maSP) throws NotFoundProductException {
        List<SanPham> in = (List<SanPham>) fileHelperCsV.readFile(PATH_LAN_2);
        if (in.isEmpty()) {
            System.out.println("Danh sách rỗng không có dữ liệu để tìm kiếm!!!");
        }
        for (int i = 0; i < in.size(); i++) {
            if (in.get(i).getMaSanPham() == (maSP.length())) {
                System.out.println(in.remove(i));
                return;
            }
        }
        throw new NotFoundProductException(maSP + " Sản phẩm không tồn tại!!");
    }
    public void delete(String maSP) throws NotFoundProductException {
        List<SanPham> in = (List<SanPham>) fileHelperCsV.readFile(PATH_LAN_2);
        if (in.isEmpty()) {
            System.out.println("Danh sách rỗng không có dữ liệu để xóa!!!");
        }
        for (int i = 0; i < in.size(); i++) {
            if (in.get(i).getMaSanPham() == (maSP.length())){
                in.remove(i);
                fileHelperCsV.writeFile(PATH_LAN_2, in);
                return;
            }
        }
        throw new NotFoundProductException(maSP + " Sản phẩm không tồn tại!!");
    }



}
