package models;

public abstract class Facility {
    private String ten;
    private double soghe;
    private int ly;
    public Facility(){
    }

    public Facility(String ten, double soghe, int ly) {
        this.ten = ten;
        this.soghe = soghe;
        this.ly = ly;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getSoghe() {
        return soghe;
    }

    public void setSoghe(double soghe) {
        this.soghe = soghe;
    }

    public int getLy() {
        return ly;
    }

    public void setLy(int ly) {
        this.ly = ly;
    }

    @Override
    public String toString() {
        return "ten='" + ten + '\'' +
                ", soghe=" + soghe +
                ", ly=" + ly +
                ',';
    }

    public abstract String show();

    public abstract Object getIdFacilyty();
}
