package ss01_contrudution_java.bai_tap;

import java.util.Scanner;

public class chuyendoitien {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner so = new Scanner(System.in);
        System.out.println("Nhap vao so tien USD :");
        usd = so.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("So tien VND la :"+quydoi);

    }
}
