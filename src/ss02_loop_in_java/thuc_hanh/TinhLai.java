package ss02_loop_in_java.bai_tap.thuc_hanh;

import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double laisuat = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so tien gui :");
        money=input.nextDouble();
        System.out.println("nhap vao so thang gui:");
        month=input.nextInt();
        System.out.println("nhap vao lai suat");
        laisuat=input.nextDouble();
        double tienlainhan = 0;
        for(int i=0;i<month;i++){
            tienlainhan += money*(laisuat/100)/12*month;
            System.out.println("tien lai nhan duoc la"+tienlainhan);

        }
    }
}
