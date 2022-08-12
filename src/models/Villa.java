package models;

import java.util.Scanner;

public class Villa extends Facility {
    private int numberOfFloor;

    public Villa(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String ten, double soghe, int ly, int numberOfFloor) {
        super(ten, soghe, ly);
        this.numberOfFloor = numberOfFloor;
    }

    public Villa() {

    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "numberOfFloor=" + numberOfFloor +
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
        Villa villa = new Villa("Khang", 4, 7, 2);
        System.out.println(villa);
    }
}
