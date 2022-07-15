package models;

public abstract class Person {
    protected String ten;
    protected long cccd;
    protected String diachi;
    public Person(){
    }

    public Person(String ten, long cccd, String diachi) {
        this.ten = ten;
        this.cccd = cccd;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getCccd() {
        return cccd;
    }

    public void setCccd(long cccd) {
        this.cccd = cccd;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ten='" + ten + '\'' +
                ", cccd=" + cccd +
                ", diachi='" + diachi + '\'' +
                '}';
    }
    public abstract String show();
}
