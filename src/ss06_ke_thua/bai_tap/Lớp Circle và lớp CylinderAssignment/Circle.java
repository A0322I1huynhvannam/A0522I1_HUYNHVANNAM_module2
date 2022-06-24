package ss06_ke_thua.bai_tap;

public class Circle {
    protected double radius = 2.0;
    protected String color = "black";

    public Circle(){
    }
    public Circle(double radius,String color){
        this.color=color;
        this.radius=radius;
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
    public double area()
    {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
