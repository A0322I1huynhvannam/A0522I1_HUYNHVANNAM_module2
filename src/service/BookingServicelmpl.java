package service;

import models.Booking;
import models.Customer;
import models.Facility;
import models.Villa;
import utils.BooKingComparator;

import java.util.*;

public class BookingServicelmpl implements BookingService{

    static Set<Booking> bookingSet = new TreeSet<>(new BooKingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility , Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        customerList.add(new Customer("nam",123,"binhnam","maaa","sda"));
        facilityIntegerMap.put(new Villa(5),1);
    }

    public static Set<Booking> sendBookingSet() {
        return bookingSet;
    }

    @Override
    public void addBooking() {
        int id=1;
        if(!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
        Scanner scanner = new Scanner(System.in);
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhap ngay bat dau");
        String startDate = scanner.nextLine();
        System.out.println("Nhap ngay tra phong");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate,endDate,customer,facility);
        bookingSet.add(booking);
        System.out.println("Booking thanh cong");

    }

    @Override
    public void displayListBooking() {
    for(Booking booking : bookingSet){
        System.out.println(booking.toString());
    }
    }
    public static Customer chooseCustomer(){
        System.out.println("danh sach khach hang");
        for(Customer customer : customerList){
            System.out.println(customer.toString());
        }
        System.out.println("nhap ten khach hang");
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        String ten = scanner.nextLine();
        while (check){
            for(Customer customer : customerList){
                if(ten == customer.getTen()){
                    check = false;
                    return customer;
                }
            }
            if(check){
                System.out.println("ban da nhap sai , vui long nhap lai id khach hang");
                ten = scanner.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("danh sach dich vu");
        for(Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }
        System.out.println("nhap id dich vu");
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        while (check){
            for(Map.Entry<Facility,Integer> entry:facilityIntegerMap.entrySet()){
                if(Objects.equals(id, entry.getKey().getIdFacilyty())){
                    check = false;
                    return  entry.getKey();
                }
            }
            if(check){
                System.out.println("ban da nhap sai , vui long nhap lai id khach hang");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }
}


