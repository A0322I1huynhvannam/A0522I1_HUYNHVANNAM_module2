package service;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import models.Customer;
import models.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerService1 implements CustomerService {
    public static LinkedList<Customer> myArrayLinkedList = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static boolean flag = false;
    static int choice;


    @Override
    public void add() {
        Customer customer = new Customer();
        System.out.println("Enter the name KH :");
        String name = sc.nextLine();
        customer.setTen(name);
        System.out.println("Enter the cccd KH:");
        long cccd = Long.parseLong(sc.nextLine());
        customer.setCccd(cccd);
        System.out.println("Enter the diachi KH:");
        String diachi = sc.nextLine();
        customer.setDiachi(diachi);
        System.out.println("Enter the endow");
        String endow = sc.nextLine();
        customer.setEndow(endow);
        System.out.println("Enter the membershipcard");
        String membershipcard = sc.nextLine();
        customer.setMembershipcard(membershipcard);

        myArrayLinkedList.add(customer);
        System.out.println("Successfully added an employee!");
    }


    @Override
    public void display() {
        for (Customer customer : myArrayLinkedList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void editProduct() {
        System.out.println("Enter Id which you want to edit: ");
        String id = sc.nextLine();
        for (Customer customer : myArrayLinkedList) {
            if (customer.getTen().equals(id)) {
                System.out.println("Enter name wanting to edit: ");
                String newten = sc.nextLine();
                customer.setTen(newten);

                System.out.println("Enter cccd wanting to edit: ");
                String newcccd = sc.nextLine();
                customer.setTen(newcccd);
                System.out.println("Enter diachi wanting to edit: ");
                String newdiachi = sc.nextLine();
                customer.setTen(newdiachi);
                System.out.println("Enter endow wanting to edit: ");
                String newendow = sc.nextLine();
                customer.setEndow(newendow);
                System.out.println("Enter membershipcard wanting to edit: ");
                String newmembershipcard = sc.nextLine();
                customer.setMembershipcard(newmembershipcard);
            }
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("MENU");
            System.out.println("1. Add name: ");
            System.out.println("2. display name");
            System.out.println("3. edit name");
            choice = Integer.parseInt(sc.nextLine());
            CustomerService customer = new CustomerService1();
            switch (choice) {
                case 1:
                    customer.add();
                    break;
                case 2:
                    customer.display();
                    break;
                case 3:
                    customer.editProduct();
                default:
                    System.out.println("Your enter is not illegal!");
            }
        }
        while (!flag);
    }
}
