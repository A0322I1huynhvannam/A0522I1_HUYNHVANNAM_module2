package ss07_abstractclass_interface_java.bai_tap.interfaceColorable;

import java.util.Scanner;

public class Square implements Colorable {
    private boolean color;
    private double canh;
    public Square(){
    }

    public Square(boolean color, double canh) {
        this.color = color;
        this.canh = canh;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    public double dientich(){
        return this.canh*this.canh;
    }
    @Override
    public String toString() {
        return "Square{" +
                "color=" + color +
                ", canh=" + canh +
                '}';
    }

    @Override
    public void howToColor() {
        if (this.color == true)
            System.out.println("all side of color");
        else
            System.out.println("one side");
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        canh= sc.nextInt();
        System.out.println("Enter the status of color for square: ");
        color = sc.nextBoolean();
        setCanh(canh);
        setColor(color);
    }

    public static void main(String[] args) {
        Square square=new Square();
        square.input();
        System.out.println(square);
        square.howToColor();
        System.out.println("dien tich la :"+square.dientich());
    }
}
