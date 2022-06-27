package ss07_abstractclass_interface_java.bai_tap.interfaceResizeable;

import ss07_abstractclass_interface_java.bai_tap.Resizeable;

public class Square implements Resizeable {
    private double canh;
    public Square(){
    }

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    public double chuvi(){
        return this.canh*4;
    }
    public double dientich(){
        return this.canh*this.canh;
    }

    @Override
    public String toString() {
        return "Square{" +
                "canh=" + canh +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.canh=this.canh*(1+percent/100);
    }

    public static void main(String[] args) {
        Square square=new Square(4);
        System.out.println(square);
        square.resize(5);
        System.out.println(square);
    }
}
