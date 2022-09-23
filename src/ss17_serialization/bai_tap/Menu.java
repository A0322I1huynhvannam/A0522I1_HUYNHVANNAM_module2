package ss17_serialization.bai_tap;


import ss17_serialization.bai_tap.SanPham;
import ss17_serialization.bai_tap.SanPhamServices;
import thithuphat1.exception.NotFoundProductException;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static SanPhamServices sanPhamServices = new SanPhamServices();

    public static void main(String[] args) {
        while (true) {
            System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM----- \n" +
                    "Chọn chức năng theo số (để tiếp tục): \n" +
                    "1.Thêm mới \n" +
                    "2.Hien Thi \n" +
                    "3.Tìm kiếm  \n" +
                    "4.Xoa  \n" +
                    "5.Thoát \n");
            int choose = getChoice();

            switch (choose) {
                case 1:
                    them();
                    break;
                case 2:
                    sanPhamServices.display();
                    break;
                case 3:
                    timKiemSP();
                    break;
                case 4:
                    deleteSanPham();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    private static int getChoice() {
        System.out.print("Nhập sự lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void them() {

        System.out.println("Nhap ma san pham :");
        int maSanPham = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten san pham :");
        String tenSanPham = sc.nextLine();
        System.out.println("Nhap Han San Pham :");
        String hanSanPham = sc.nextLine();
        System.out.println("Nhap gia :");
        int gia = Integer.parseInt(sc.nextLine());
        System.out.println("cac mo ta khac :");
        String cacMoTaKhac = sc.nextLine();
        SanPham sanPham = new SanPham(maSanPham, tenSanPham, hanSanPham, gia, cacMoTaKhac);
        sanPhamServices.add(sanPham);
        System.out.println("Thêm Thành công");
    }

    public static void timKiemSP() {
        boolean tmp = false;
        do {
            System.out.print(tmp ? "Nhập lại\nMuốn thoát nhân phím -1:end \nMời chọn:   " : "Nhập mã sản phẩm cần tìm: ");
            String maKHTim = sc.nextLine();
            if (maKHTim.equals("-1")) {
                break;
            }
            try {
                sanPhamServices.timKiem(maKHTim);
                System.out.println("Tìm kiếm thành công");
                tmp = false;

            } catch (NotFoundProductException e) {
                System.out.println(e.getMessage());
                tmp = true;
            }
        } while (tmp);
    }
    public static void deleteSanPham() {
        sanPhamServices.display();
        boolean tmp = false;
        String maSP;
        do {
            System.out.print(tmp ? "Nhập lại " : "Nhập mã sản phẩm cần xóa: ");
            maSP = sc.nextLine();
            System.out.println("Bạn có muốn xóa sản phẩm \n Ấn 1:Yes || 2: No");
            int yesNo = Integer.parseInt(sc.nextLine());
            if (yesNo == 2) {
                break;
            }
            try {
                sanPhamServices.delete(maSP);
                System.out.println("Xoá thành công");
                tmp = false;

            } catch (NotFoundProductException e) {
                System.out.println(e.getMessage());
                tmp = true;
            }
        } while (tmp);
    }



}
