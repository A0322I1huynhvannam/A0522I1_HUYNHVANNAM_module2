package ss10_danh_sach.bai_tap.BaiTapThem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyServicelmpl1 implements QuanLyServicelmpl{
    private static List<QuanLy> myArrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static boolean flag = false;
    static int choice;


    public static void main(String[] args) {
        do{
            System.out.println("CHUONG TRINH QUAN LY SINH VIEN ");
            System.out.println("chon chuc nang theo so (de tiep tuc) :");
            System.out.println("1.them moi giang vien hoac hoc sinh ");
            System.out.println("2.xoa giang vien hoac hoc sinh ");
            System.out.println("3.xem danh sach giang vien hoac hoc sinh");
            System.out.println("4.Thoat");
            System.out.println("Chon chuc nang :");
            choice = Integer.parseInt(sc.nextLine());
            QuanLyServicelmpl quanLyServicelmpl = new QuanLyServicelmpl1();
            switch (choice){
                case 1 :
                    quanLyServicelmpl.them();
                    break;
                case 2 :
                    quanLyServicelmpl.xoa();
                    break;
                case 3 :
                    quanLyServicelmpl.hienthi();
                    break;
                case 4 :
                    System.exit(0);
                default:
                    System.out.println("Your enter is not illegal!");

            }

        }while (!flag);
    }
    public void them() {
        System.out.println("1.Them hoc sinh \n2.Them giang vien");
        int choice = getChoice();
        System.out.println("Nhap ma :");
        String Ma = sc.nextLine();
        System.out.println("Nhap ten : ");
        String Ten = sc.nextLine();
        System.out.println("Nhap ngay sinh :");
        String ngaySinh = sc.nextLine();
        System.out.println("Gioi Tinh :");
        String gioiTinh = sc.nextLine();
        QuanLy quanLy;
        if(choice == 1){
            System.out.println("Nhap diem so :");
            String diemSo = sc.nextLine();
            quanLy = new HocVien(Ma,Ten,ngaySinh,gioiTinh,diemSo);
        }else {
            System.out.println("Nhap chuyen mon :");
            String chuyenMon= sc.nextLine();
            quanLy = new GiangVien(Ma,Ten,ngaySinh,gioiTinh,chuyenMon);
        }
        myArrayList.add(quanLy);
    }

    @Override
    public void xoa() {
//        System.out.println("1.Xoa hoc sinh \n 2.Xoa giang vien");
//        int choice = getChoice();
        System.out.println("Nhap ma can xoa:");
        String ma = sc.nextLine();
        for(int i = 0;i<myArrayList.size();i++){
            if(myArrayList.get(i).getMa().equals(ma)){
                myArrayList.remove(i);
            }
        }
        if (flag)
            System.out.println("Xoa Khong Thanh Cong");
        else
            System.out.println("Xoa Thanh Cong!");
    }



    @Override
    public void hienthi() {
        for(QuanLy quanLy : myArrayList){
            System.out.println(quanLy.toString());
        }

    }
    private static int getChoice() {
        System.out.print("Nhập sự lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }

}
