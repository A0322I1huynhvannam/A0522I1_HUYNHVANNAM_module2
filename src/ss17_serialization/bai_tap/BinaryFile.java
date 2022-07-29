package ss17_serialization.bai_tap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryFile {
    static boolean flag = false;
    static int choice;

    public static void main(String[] args) {
        try {
            do {
                Scanner scanner = new Scanner(System.in);
                List<Product> products = readFile("27-Jul-22 6:33 PM, 1 file: Creating file D:\\codegym\\A0322I1huynhvannam\\Module2\\A0322i1_HUYNHVANNAM_module_2\\src\\ss17_serialization\\bai_tap\\product.csv");
                System.out.println("1.add");
                System.out.println("2.display to product");
                System.out.println("3.Search product");
                System.out.println("4.exit");
                choice=scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("input id product");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.println("input name product");
                        String name = scanner.nextLine();
                        System.out.println("input khan product");
                        String khan = scanner.nextLine();
                        System.out.println("input descriptions ");
                        String descriptions = scanner.nextLine();
                        System.out.println("input price");
                        double price = Double.parseDouble(scanner.nextLine());
                        products.add(new Product(id,name,khan,descriptions,price));
                        System.out.println("Write to file");
                        writeFile("27-Jul-22 6:33 PM, 1 file: Creating file D:\\codegym\\A0322I1huynhvannam\\Module2\\A0322i1_HUYNHVANNAM_module_2\\src\\ss17_serialization\\bai_tap\\product.csv",products);
                    case 2:
                        display();
                        break;
                    case 3:
                        search();
                        break;
                    case 4 :
                        System.exit(0);


                }
            }while (true);
        }catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
    }

    private static List<Product> readFile(String FilePath) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FilePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
        return products;
    }
    private static void writeFile(String filePath,List<Product> products){
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
    }
    private static void display(){
        System.out.println("display product");
        List<Product> read = readFile("27-Jul-22 6:33 PM, 1 file: Creating file D:\\codegym\\A0322I1huynhvannam\\Module2\\A0322i1_HUYNHVANNAM_module_2\\src\\ss17_serialization\\bai_tap\\product.csv");
        for(Product products : read ){
            System.out.println(products);
        }
    }
    private static void search(){

    }
}
