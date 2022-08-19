package thi.controllers;

import thi.models.NganHang;
import thi.models.ThanhToan;
import thi.models.TietKiem;
import thi.services.NganHangService;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    private static NganHangService nganHangService = new NganHangService();

    public static void main(String[] args) throws NotFoundBankAcountException {
        while (true) {
            System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM----- \n" +
                    "Chọn chức năng theo số (để tiếp tục): \n" +
                    "1.Thêm mới \n" +
                    "2.Xoá \n" +
                    "3.Xem danh sách các sản phẩm \n" +
                    "4.Tìm kiếm  \n" +
                    "5.Thoát \n");
            int choose = getChoice();
            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void add() {
        System.out.println("1.Tài Khoản Tiết Kiệm  \n2.Tài Khoản Thanh Toán ");
        int choose = getChoice();
        System.out.println("Id tài khoản: ");
        String idTaiKhoan = sc.nextLine();
        System.out.println("Ma Tai Khoan: ");
        String maTaiKhoan = sc.nextLine();
        System.out.println("Ten Chu Tai khoan: ");
        String tenChuTaiKhoan = sc.nextLine();
        System.out.println("Ngay Tao tai Khoanr: ");
        String ngayTaoTaiKhoan = sc.nextLine();
        NganHang nganHang;
        if (choose == 1) {
            String soTienTietKiem = sc.nextLine();
            String ngayGuiTietKiem = sc.nextLine();
            String laiSuat = sc.nextLine();
            String kiHan = sc.nextLine();
            nganHang = new TietKiem(0, maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan,soTienTietKiem,ngayGuiTietKiem,laiSuat,kiHan);
        } else {
            String soThe = inputWithEmpty("So the :");
            String soTienTrongThe = inputWithEmpty("so tien trong the: ");
            nganHang = new ThanhToan(0,maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan,soThe,soTienTrongThe);

        }
        nganHangService.add(nganHang);
        System.out.println(" Thêm thành công");
    }

    public static void display() {
        List<NganHang> nganHangs = NganHangService.findAll();
        for (int i = 0; i < nganHangs.size(); i++) {
            System.out.println(nganHangs.get(i));
        }
    }

    public static void delete() throws NotFoundBankAcountException {
        display();
        boolean tmp = false;
        do {
            System.out.print(tmp ? "Nhập lại " : "Nhập Ma Tai Khoan :");
            int maTaiKhoan = Integer.parseInt(sc.nextLine());
            NganHangService.delete(maTaiKhoan);
            System.out.println("Xoá thành công");
            tmp = false;

        } while (tmp);
    }



    private static String inputWithEmpty(String s) {
        String val = "0";
        do {
            String field = null;
            System.out.print(val.isEmpty() ? "Sai format. Nhập " : field + ":");
            val = sc.nextLine();
        } while (!val.trim().isEmpty());

        return val;
    }

    private static int getChoice() {
        System.out.print("Nhập sự lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }
}
