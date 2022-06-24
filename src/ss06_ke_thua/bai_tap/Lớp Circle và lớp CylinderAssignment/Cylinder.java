package ss06_ke_thua.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

//    @Override
//    public String toString() {
//        return "Cylinder {" +
//                "height=" + height +
//                ", radius=" + radius +
//                ", color='" + color + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Cylinder {" +
                "height=" + getHeight() +
                ", radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10,5,"red");
        System.out.println(cylinder);

    }

}
