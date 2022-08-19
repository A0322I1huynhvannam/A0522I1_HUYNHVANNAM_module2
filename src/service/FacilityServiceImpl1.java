package service;

import com.sun.javaws.exceptions.ExitException;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import org.w3c.dom.ls.LSOutput;

import javax.xml.ws.Service;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl1 implements FacilityServiceImpl {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    static Scanner sc = new Scanner(System.in);
    static boolean flag = false;
    static int choice;

    public static void showInformation() {
        System.out.println("  Menu ");
        System.out.println("1.ADD new Villa");
        System.out.println("2.Add new House");
        System.out.println("3.Add new Room");
        System.out.println("4.Back to menu");
    }

    @Override
    public void addservice() {
        do {
            showInformation();
            System.out.println("Enter your choise: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bad format. Please enter again!");
            }
            switch (choice){
                case 1 :
                    addVilla();
                    break;
                case 2:
                    addRoom();
                    break;
                case 3:
                    addRoom();
                case 4 :
                    flag = true;
                    break;
                default:
                    System.out.println("Your enter is not illegal!");
            }
        }while (!flag);

    }

    @Override
    public void addVilla() {
        Villa villa = new Villa();
        System.out.println("nhap ten :");
        String ten = sc.nextLine();
        villa.setTen(ten);
        System.out.println("nhap so ghe :");
        double soghe = sc.nextInt();
        villa.setSoghe(soghe);
        System.out.println(" nhap so ly :");
        int ly=sc.nextInt();
        villa.setLy(ly);
        System.out.println("enter the numberOfFloor :");
        int numberOfFloor = sc.nextInt();
        villa.setNumberOfFloor(numberOfFloor);
        facilityMap.put(villa,0);
        System.out.println("Successfully added an employee!");
    }

    @Override
    public void addHouse() {
        House house = new House();
        System.out.println("nhap ten :");
        String ten = sc.nextLine();
        house.setTen(ten);
        System.out.println("nhap so ghe :");
        double soghe = sc.nextInt();
        house.setSoghe(soghe);
        System.out.println(" nhap so ly :");
        int ly=sc.nextInt();
        house.setLy(ly);
        System.out.println("enter the typeOfBed");
        String typeOfBed = sc.nextLine();
        house.setTypeOfBed(typeOfBed);
        facilityMap.put(house,1);
        System.out.println("Successfully added an employee!");

    }

    @Override
    public void addRoom() {
        Room room = new Room();
        System.out.println("nhap ten :");
        String ten = sc.nextLine();
        room.setTen(ten);
        System.out.println("nhap so ghe :");
        double soghe = sc.nextInt();
        room.setSoghe(soghe);
        System.out.println(" nhap so ly :");
        int ly=sc.nextInt();
        room.setLy(ly);
        System.out.println("Enter the complimentary");
        String complimentary=sc.nextLine();
        room.setComplimentary(complimentary);
        facilityMap.put(room,2);
        System.out.println("Successfully added an employee!");
    }

    @Override
    public void displayservice() {
    for(Facility facility : facilityMap.keySet()){
        System.out.println(facility+" - " + facilityMap.get(facility));
    }
    }


    @Override
    public void displayeditservice(){
        for(Facility facility : facilityMap.keySet()){
            System.out.println(facility+" - " + facilityMap.get(facility));
        }

    }

    public static void main(String[] args) {
        do {
            System.out.println("MENU");
            System.out.println("1. Add facility: ");
            System.out.println("2. display facility");
            System.out.println("3. display facility edit");
            choice = Integer.parseInt(sc.nextLine());
            FacilityServiceImpl facilityService = new FacilityServiceImpl1();
            switch (choice) {
                case 1:
                    facilityService.addservice();
                    break;
                case 2:
                    facilityService.displayservice();
                    break;
                case 3:
                    facilityService.displayeditservice();
//                case 4:
//                    flag = true;
//                    break;
                default:
                    System.out.println("Your enter is not illegal!");
            }
        }
        while (flag);
    }
}
