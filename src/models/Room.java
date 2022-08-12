package models;

public class Room extends Facility {
    private String complimentary;
    public Room(){
    }

    public Room(String complimentary) {
        this.complimentary = complimentary;
    }

    public Room(String ten, double soghe, int ly, String complimentary) {
        super(ten, soghe, ly);
        this.complimentary = complimentary;
    }

    public String getComplimentary() {
        return complimentary;
    }

    public void setComplimentary(String complimentary) {
        this.complimentary = complimentary;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "complimentary='" + complimentary + '\'' +
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
        Room room=new Room("nam",4,7,"sleep");
        System.out.println(room);
    }
}
