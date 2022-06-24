package ss06_ke_thua.bai_tap;

public class Point2D {
    private double x = 0.0;
    private double y = 0.0;
    public Point2D(){
    }
    public Point2D(double x, double y){
        this.x=x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
