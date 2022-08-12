package models;

public class House extends Facility {
    private String typeOfBed;
    public House(){
    }

    public House(String typeOfBed) {
        this.typeOfBed = typeOfBed;
    }

    public House(String ten, double soghe, int ly, String typeOfBed) {
        super(ten, soghe, ly);
        this.typeOfBed = typeOfBed;
    }

    public String getTypeOfBed() {
        return typeOfBed;
    }

    public void setTypeOfBed(String typeOfBed) {
        this.typeOfBed = typeOfBed;
    }

    @Override
    public String toString() {
        return "House{" +
                "typeOfBed='" + typeOfBed + '\'' +
                '}';
    }

    @Override
    public String show() {
        return this.toString();
    }

    @Override
    public Object getIdFacilyty() {
        return null;
    }

    public static void main(String[] args) {
        House house=new House("2 tang");
        System.out.println(house);
    }
}
