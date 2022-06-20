package ss04_lop_doi_tuong_java.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        HinhChuNhat hcn = new HinhChuNhat(10,20);
//        System.out.println(hcn.display());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of rectangle: ");
        double height = sc.nextDouble();
        System.out.println("Enter the weight of rectangle: ");
        double weight = sc.nextDouble();
        HinhChuNhat hcn1 = new HinhChuNhat(weight, height);

        System.out.println("Your Rectangle \n" + hcn1.display());
        System.out.println("Perimeter of the Rectangle: " + hcn1.getPerimeter());
        System.out.println("Area of the Rectangle: " + hcn1.getArea());
    }
}
