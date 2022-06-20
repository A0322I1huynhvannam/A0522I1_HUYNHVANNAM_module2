package ss02_loop_in_java.bai_tap.thuc_hanh;

import java.util.Scanner;

public class HienThiHinh {
    public static void InHinhChuNhat(){
        for(int i=0;i<3;i++){
            for(int j=0;j<7;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void InHinhTamGiac1(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void InHinhTamGiacVuong(){
        for(int i=7;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InHinhChuNhat();
        InHinhTamGiac1();
        InHinhTamGiacVuong();
        int choice = -1;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        System.out.println("Menu :");
        while (choice != 0) {
            switch (choice) {
                case 1: {
                    System.out.println("1.Print the rectangle");
                    break;
                }
                case 2: {
                    System.out.println(("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)"));
                    break;
                }
                case 3: {
                    System.out.println("3.Print isosceles triangle");
                    break;
                }
                case 4: {
                    System.out.println("4.Exit");
                    break;
                }
            }


        }
    }
    }

