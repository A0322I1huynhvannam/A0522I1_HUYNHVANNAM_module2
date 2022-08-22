package ss07_abstractclass_interface_java.bai_tap.interfaceResizeable;


public class Rectangle implements Resizeable {
    private double chieudai;
    private double chieurong;

    public Rectangle(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
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
     return  this.chieurong*this.chieudai;
    }
    public double chuvi(){
        return (this.chieudai+this.chieurong)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "chieudai=" + chieudai +
                ", chieurong=" + chieurong +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.chieudai = chieudai + (1+percent/100);
        this.chieurong = chieurong + (1+percent/100);

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println(rectangle);
        System.out.println("dien tich hcn la "+rectangle.dientich());
        System.out.println("chu vi la "+rectangle.chuvi());
        rectangle.resize(10);
        System.out.println(rectangle);
    }
}
