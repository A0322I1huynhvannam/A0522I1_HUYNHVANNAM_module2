package ss02_loop_in_java.bai_tap.thuc_hanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a :");
        a=input.nextInt();
        System.out.println("Nhap so b :");
        b=input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0 || b==0){
            System.out.println("Khong co uoc chung lon nhat");
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Uoc chung lon nhat la:"+a );
        }
    }
}
