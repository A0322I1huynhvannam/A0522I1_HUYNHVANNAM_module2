package debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    protected  Triangle(double a,double b, double c) throws IllegalTriangleException{
        if (a>=b+c || b>=a+c || c>=a+b) {
            throw new IllegalTriangleException("3 canh tam giac khong hop le");
        } else if (a<=0 || b<=0 || c<=0) {
            throw new IllegalTriangleException("3 canh tam giac khong hop le");
        } else {
            System.out.println("Tam giac binh thuong");
        }
    }
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao a : ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhap vao b : ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhap vao c : ");
        c = Integer.parseInt(scanner.nextLine());
        try {
            new Triangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Chuong trinh ket thuc");
        }

    }

}
