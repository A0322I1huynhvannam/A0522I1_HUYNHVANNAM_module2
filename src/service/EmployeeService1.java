package service;

import models.Employee;
import utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeService1 implements EmployeeService {
    private static List<Employee> myArrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static boolean flag = false;
    static int choice;

    @Override
    public void addname() {
        Employee employee = new Employee() ;
        System.out.println("Enter the name :");
        String name = sc.nextLine();
        employee.setTen(name);
        System.out.println("Enter the cccd:");
        long cccd = Long.parseLong(sc.nextLine());
        employee.setCccd(cccd);
        System.out.println("Enter the diachi :");
        String diachi = sc.nextLine();
        employee.setDiachi(diachi);

        myArrayList.add(employee);
        ReadAndWrite.write( myArrayList,"D:\\codegym\\A0322I1huynhvannam\\Module2\\A0322i1_HUYNHVANNAM_module_2\\src\\data\\employee.csv");
        System.out.println("Successfully added an employee!");
    }

    @Override
    public void displayname() {
        myArrayList = (List<Employee>) ReadAndWrite.read("D:\\codegym\\A0322I1huynhvannam\\Module2\\A0322i1_HUYNHVANNAM_module_2\\src\\data\\employee.csv");
        for (Employee employee : myArrayList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void editname() {
        System.out.println("Enter Id which you want to edit: ");
        String id= sc.nextLine();
        for(Employee employee : myArrayList){
            if(employee.getTen().equals(id)){
                System.out.println("Enter name wanting to edit: ");
                String newten = sc.nextLine();
                employee.setTen(newten);

                System.out.println("Enter cccd wanting to edit: ");
                String newcccd = sc.nextLine();
                employee.setTen(newcccd);
                System.out.println("Enter diachi wanting to edit: ");
                String newdiachi = sc.nextLine();
                employee.setTen(newdiachi);

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
            EmployeeService employee = new EmployeeService1();
            switch (choice) {
                case 1:
                    employee.addname();
                    break;
                case 2:
                    employee.displayname();
                    break;
                case 3:
                    employee.editname();
                default:
                    System.out.println("Your enter is not illegal!");
            }
        } while (!flag);
    }
}
