package ss06_ke_thua.bai_tap;

public class Point3D extends Point2D {
    private double z=0.0;
    public Point3D(){
    }
    public Point3D(double z){
        this.z = z;
    }
    public Point3D(double x,double y, double z){
        super(x, y);
        this.z = z ;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                "y=" + getY() +
                "z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D=new Point3D(3.4,4.5,6.7);
        System.out.println(point3D);
    }
}
