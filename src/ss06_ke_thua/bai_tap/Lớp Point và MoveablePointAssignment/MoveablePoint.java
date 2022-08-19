package ss06_ke_thua.bai_tap;

public class MoveablePoint extends ss06_ke_thua.bai_tap.Point {
    private double xSpeed = 0.0;
    private double ySpeed = 0.0;
    public MoveablePoint(){
    }
    public MoveablePoint(double x, double y,double xSpeed,double ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=y;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "x=" + xSpeed +
                ", y=" + ySpeed +
                '}';
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint(3.5,3.6,6,8);
        System.out.println(moveablePoint);

    }
}
