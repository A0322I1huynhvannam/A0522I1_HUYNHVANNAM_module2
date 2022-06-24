package ss03_mang_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class TinhTongCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so cot :");
        int cot = scanner.nextInt();
        System.out.println("nhap so hang :");
        int hang = scanner.nextInt();
        int[][] myArr = new int[cot][hang];
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                System.out.print("nhap vao so cot thu " + (i + 1) + " va so hang " + (j + 1) + ":");
                myArr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mang So la: ");
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                System.out.print(myArr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Nhap so cot can tinh :");
        int index = scanner.nextInt();
        int sum = 0;
        if (index <= myArr[0].length) {
            for (int i = 0; i < cot; i++) {
                for (int j = 0; j < hang; j++) {
                    if (j == index - 1) {
                        sum += myArr[i][j];
                    }
                }
            }
            System.out.println("Tong cac gia tri co trong cot  " + index + "  trong mang la : " + sum);
        } else {
            System.out.println("Cot nhap khong co!");
        }
    }
}
