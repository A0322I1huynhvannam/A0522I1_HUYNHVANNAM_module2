package ss12_khung_suu_tap.bai_tap.controllers;

import ss12_khung_suu_tap.bai_tap.services.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         boolean flag = false;
         int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Add new product: ");
            System.out.println("2. Update the product");
            System.out.println("3. Remove the product");
            System.out.println("4. Display the product");
            System.out.println("5. Search the product");
            System.out.println("6. Sort the product Ascending or Descending");
            System.out.println("7. Exist!");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            ProductManager productManager = new ProductManager();
            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.editProduct();
                    break;
                case 3:
                    productManager.removeProduct();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.searchProductByName();
                    break;
                case 6:
                    productManager.Sort();
                    break;
                case 7:
                    flag = true;
                    break;
                default:
                    System.out.println("Your enter is not illegal!");
            }
        } while (!flag);
    }
}
