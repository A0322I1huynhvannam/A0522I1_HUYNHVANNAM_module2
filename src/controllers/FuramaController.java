package controllers;

import service.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static boolean flag = false;

    public static void displayMainMenu() {
        System.out.println("----------MENU----------");
        System.out.println("1. Employee Management: ");
        System.out.println("2. Customer Management: ");
        System.out.println("3. Facility Management: ");
        System.out.println("4. Booking Management: ");
        System.out.println("5. Promotion Management: ");
        System.out.println("6. Exit!");
    }

    public static void showEmployeeManagement() {
        System.out.println("----------Services Managing Employee----------");
        System.out.println("1. Display list employees: ");
        System.out.println("2. Add new employee: ");
        System.out.println("3. Edit employee: ");
        System.out.println("4. Return main menu: ");
    }

    public static void showCustomerManagement() {
        System.out.println("----------Services Managing Customer----------");
        System.out.println("1. Display list customers: ");
        System.out.println("2. Add new customer: ");
        System.out.println("3. Edit customer: ");
        System.out.println("4. Remove customer: ");
        System.out.println("5. Check is Customer: ");
        System.out.println("6. Return main menu: ");
    }

    public static void showFacilityManagement() {
        System.out.println("----------Services Managing Facility----------");
        System.out.println("1. Display list facility: ");
        System.out.println("2. Add new facility: ");
        System.out.println("3. Display list facility maintenance: ");
        System.out.println("4. Return main menu: ");
    }

    public static void showBookingManagerment() {
        System.out.println("----------Services Managing Booking----------");
        System.out.println("1. Add new booking: ");
        System.out.println("2. Display list booking: ");
        System.out.println("3. Create new contacts: ");
        System.out.println("4. Display list contacts: ");
        System.out.println("5. Edit contacts: ");
        System.out.println("6. Return main menu: ");
    }

    public static void showPromotionManagement() {
        System.out.println("----------Services Managing Promotion----------");
        System.out.println("1. Display list customers use service: ");
        System.out.println("2. Display list customers get voucher: ");
        System.out.println("3. Return main menu: ");
    }


    public static void main(String[] args) {
        do {
            displayMainMenu();
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Import bad format, please enter back");
            }
            switch (choice) {
                case 1:
                    EmployeeService employee = new EmployeeService1();
                    do {
                        showEmployeeManagement();
                        System.out.println("Enter your choice: ");
                        try {
                            choice = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        switch (choice) {
                            case 1:
                                employee.displayname();
                                break;
                            case 2:
                                employee.addname();
                                break;
                            case 3:
                                employee.editname();
                                break;
//                            case 4:
//                                employee.removeEmployee();
//                                break;
//                            case 5:
//                                if (employee.isEmployee() == null) {
//                                    System.out.println("The employee is not exist!");
//                                } else {
//                                    System.out.println(employee.isEmployee().toString());
//                                }
//                                break;
                            case 4:
                                flag = true;
                                break;
                            default:
                                System.out.println("Your choice is not right! Please enter again.");
                        }
                    } while (!flag);
                    break;

                case 2:
                    CustomerService customer = new CustomerService1();
                    do {
                        showCustomerManagement();
                        System.out.println("Enter your choice: ");
                        try {
                            choice = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        switch (choice) {
                            case 1:
                                customer.display();
                                break;
                            case 2:
                                customer.add();
                                break;
                            case 3:
                                customer.editProduct();
                                break;
                          //
                            case 4:
                                flag = true;
                                break;
                            default:
                                System.out.println("Your choice is not right! Please enter again.");
                        }
                    } while (!flag);
                    break;

                case 3:
                    FacilityServiceImpl facility = new FacilityServiceImpl1();
                    do {
                        showFacilityManagement();
                        System.out.println("Enter your choice: ");
                        try {
                            choice = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        switch (choice) {
                            case 1:
                                facility.displayservice();
                                break;
                            case 2:
                                facility.addservice();
                                break;
                            case 3:
                                facility.displayeditservice();
                                break;
                            case 4:
                                flag = true;
                                break;
                            default:
                                System.out.println("Your choice is not right! Please enter again.");
                        }
                    } while (!flag);
                    break;

                case 4:
                    BookingService booking = new BookingServicelmpl();
                    ContractService contract = new ContractServiceImpl();
                    do {
                        showBookingManagerment();
                        System.out.println("Enter your choice: ");
                        try {
                            choice = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        switch (choice) {
                            case 1:
                                booking.addBooking();
                                break;
                            case 2:
                                booking.displayListBooking();
                                break;
                            case 3:
                                contract.creatNewContact();
                                break;
                            case 4:
                                contract.displayListContact();
                                break;
                            case 5:
                                contract.editContact();
                                break;
                            case 6:
                                flag = true;
                                break;
                            default:
                                System.out.println("Your choice is not right! Please enter again.");
                        }
                    } while (!flag);
                    break;
//                case 5:
//                    PromotionService promotionService = new PromotionServiceImpl();
//                    do {
//                        showPromotionManagement();
//                        System.out.println("Enter your choice: ");
//                        try {
//                            choice = Integer.parseInt(sc.nextLine());
//                        } catch (NumberFormatException e) {
//                            System.out.println("Import bad format, please enter back");
//                        }
//                        switch (choice) {
//                            case 1:
//                                promotionService.displayListCustomersUseService();
//                                break;
//                            case 2:
//                                promotionService.displayListCustomersGetVoucher();
//                                break;
//                            case 3:
//                                flag = true;
//                                break;
//                            default:
//                                System.out.println("Your choice is not right! Please enter again.");
//                        }
//                    } while (!flag);
//                    break;
                default:
                    System.out.println("GOODBYE AND SEE YOU AGAIN!");
                    System.exit(0);
            }
        } while (flag);
    }
}
