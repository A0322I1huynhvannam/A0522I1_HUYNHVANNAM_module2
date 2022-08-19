package service;

import models.Booking;
import models.Contract;
import models.Customer;

import java.util.*;

public class ContractServiceImpl implements ContractService{
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void creatNewContact() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServicelmpl().sendBookingSet();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            String customer = booking.getCodecustomer();
            System.out.println("dang tao hop dong cho booking co thong tin " + booking.toString());
            System.out.println("dang tao hop dong cho khach hang co thong tin" + customer.toString());
            String codebooking = scanner.nextLine();
            System.out.println("nhap so tien tra truoc");
            String depositamount = scanner.nextLine();
            System.out.println("nhap so tien chi phi");
            String totalmoney = scanner.nextLine();
            Contract contract = new Contract(codebooking, booking, depositamount, totalmoney, customer);
            contractList.add(contract);
            System.out.println("da tao hopp dong thanh cong" + contract.toString());


        }
    }


    @Override
    public void displayListContact() {
        for(Contract contract : contractList){
            System.out.println(contract.toString());
        }

    }

    @Override
    public void editContact() {
        System.out.println("Enter id which you want to edit: ");
        String codebooking = scanner.nextLine();
        System.out.println("nhap ma khach hang");
        String codecustomer=scanner.nextLine();
        System.out.println("");
        System.out.println("nhap so tien tra truoc");
        String depositamount = scanner.nextLine();
        System.out.println("nhap so tien chi phi");
        String totalmoney = scanner.nextLine();
        System.out.println("so hop dong");
        String Somecontracts=scanner.nextLine();


    }
}
