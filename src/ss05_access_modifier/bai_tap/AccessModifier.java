package ss05_access_modifier.bai_tap;

public class AccessModifier {
    private int radius=1;
    private String color="red";

    protected AccessModifier(int radius){
        this.radius=radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public double getArea() {
        return getRadius()*getRadius()*Math.PI;
    }

    public String getColor() {
        return color="black";
    }

    public static void main(String[] args) {
        AccessModifier n=new AccessModifier(9);
        System.out.println("Đối tượng hình tròn có: ");
        System.out.println("Bán kính đường tròn là: " + n.getRadius()+"\nDiện tích là: "+ n.getArea()+ "\nMàu: "+ n.getColor());
    }
}
