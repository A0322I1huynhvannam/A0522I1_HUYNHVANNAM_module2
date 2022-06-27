package ss07_abstractclass_interface_java.bai_tap;

import java.util.Scanner;

public class Rectangle implements Resizeable {
    private double chieudai;
    private double chieurong;

    public Rectangle(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public Rectangle(){
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    public double dientich(){
        return this.chieudai*this.chieurong;
    }
    public double chuvi(){
        return (this.chieurong+this.chieudai)*2;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "chieudai=" + chieudai +
                ", chieurong=" + chieurong +
                '}';
    }

    public void resize(double percent){
        this.chieurong = chieurong * (1+percent/100);
        this.chieudai = chieudai * (1+percent/100);
    }

    public static void main(String[] args) {
        Rectangle recc1 = new Rectangle(10,20);
        System.out.println(recc1);
        System.out.println("dien tich hcn la "+recc1.dientich());
        System.out.println("chu vi la "+recc1.chuvi());
        recc1.resize(10);
        System.out.println(recc1);
    }

}
