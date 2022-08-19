package ss05_access_modifier.bai_tap;

import java.util.Scanner;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";
    public AccessModifier(){}

    protected AccessModifier(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public String getColor() {
        return color = "black";
    }

    public static void main(String[] args) {
        AccessModifier n = new AccessModifier(9.5);
        System.out.println("Đối tượng hình tròn có: ");
        System.out.println("Bán kính đường tròn là: " + n.getRadius() + "\nDiện tích là: " + n.getArea() + "\nMàu: " + n.getColor());
    }
}
