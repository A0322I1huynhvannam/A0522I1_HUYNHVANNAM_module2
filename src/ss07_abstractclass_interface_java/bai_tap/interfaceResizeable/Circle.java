package ss07_abstractclass_interface_java.bai_tap;

public class Circle implements Resizeable {
    protected double radius = 2.0;
    protected String color = "black";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius=this.radius*(1+percent/100);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(23,"red");
        System.out.println(circle);
        circle.resize(24);
        System.out.println(circle);
    }
}
