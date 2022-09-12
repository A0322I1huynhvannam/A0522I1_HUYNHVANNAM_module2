package ss12_khung_suu_tap.bai_tap.services;

import ss12_khung_suu_tap.bai_tap.controllers.ComparatorByHigher;
import ss12_khung_suu_tap.bai_tap.controllers.ComparatorByLower;
import ss12_khung_suu_tap.bai_tap.models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static List<Product> myArrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static boolean flag = false;
    static int choice;

    public void add() {
        Product product = new Product();
        System.out.println("Enter the id's product: ");
        String id = sc.nextLine();
        product.setId(id);

        System.out.println("Enter name's product: ");
        String name = sc.nextLine();
        product.setName(name);

        System.out.println("Enter price for product: ");
        float price = Float.parseFloat(sc.nextLine());
        product.setPrice(price);

        myArrayList.add(product);
    }

    public void display() {
        for (Product product : myArrayList) {
            System.out.println(product.toString());
        }
    }

    public void editProduct() {
        System.out.println("Enter Id which you want to edit: ");
        String id = sc.nextLine();
        for (Product product : myArrayList) {
            if (product.getId().equals(id)) {
                System.out.println("Enter name wanting to edit: ");
                String newName = sc.nextLine();
                product.setName(newName);

                System.out.println("Enter price wanting to edit: ");
                float price = Float.parseFloat(sc.nextLine());
                product.setPrice(price);
            }
        }
    }

    public void removeProduct() {
        System.out.println("Enter the id's product which you want to remove:");
        String id = sc.nextLine();
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).getId().equals(id)) {
                myArrayList.remove(i);
            }
        }
        if (flag)
            System.out.println("Deleted");
        else
            System.out.println("The ID which you inputting is not exist!");
    }

    public void showProduct() {
        for (Product product : myArrayList) {
            if (product != null) {
                System.out.println(product.toString());
            }
        }
    }

    public void searchProductByName() {
        System.out.println("Enter the name which you want to find: ");
        String name = sc.nextLine();
        for (Product product : myArrayList) {
            if (product != null && product.getName().contains(name)) {
                System.out.println(product);
            }
        }
        if (flag)
            System.out.println("-----The name: " + name + " is exist-----");
        else
            System.out.println("-----The name: " + name + " is not exist!-----");
    }

    public void Sort() {
        System.out.println("1.sort product ByAscendingPrice \n 2.sortProductByDescendingPrice");
        int choice = getChoice();
        if (choice == 1) {
            sortProductByAscendingPrice();
        } else {
            sortProductByDescendingPrice();
        }
    }

    public void sortProductByAscendingPrice() {
        Collections.sort(myArrayList, new ComparatorByHigher());
        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i).toString());
    }

    public void sortProductByDescendingPrice() {
        Collections.sort(myArrayList, new ComparatorByLower());
        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i).toString());
    }

    private static int getChoice() {
        System.out.print("Nhập sự lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }


//    public static void main(String[] args) {
//        do {
//            System.out.println("MENU");
//            System.out.println("1. Add new product: ");
//            System.out.println("2. Update the product");
//            System.out.println("3. Remove the product");
//            System.out.println("4. Display the product");
//            System.out.println("5. Search the product");
//            System.out.println("6. Sort the product Ascending or Descending");
//            System.out.println("7. Exist!");
//            System.out.println("Enter your choice: ");
//            choice = Integer.parseInt(sc.nextLine());
//            ProductManager productManager = new ProductManager();
//            switch (choice) {
//                case 1:
//                    productManager.add();
//                    break;
//                case 2:
//                    productManager.editProduct();
//                    break;
//                case 3:
//                    productManager.removeProduct();
//                    break;
//                case 4:
//                    productManager.display();
//                    break;
//                case 5:
//                    productManager.searchProductByName();
//                    break;
//                case 6:
//                    productManager.Sort();
//                    break;
//                case 7:
//                    flag = true;
//                    break;
//                default:
//                    System.out.println("Your enter is not illegal!");
//            }
//        } while (!flag);
//    }


}
