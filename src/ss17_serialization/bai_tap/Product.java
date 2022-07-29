package ss17_serialization.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
     private int id;
     private String name, khan , descriptions;
     private double price;
     public Product(){

     }

    public Product(int id, String name, String khan, String descriptions, double price) {
        this.id = id;
        this.name = name;
        this.khan = khan;
        this.descriptions = descriptions;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKhan() {
        return khan;
    }

    public void setKhan(String khan) {
        this.khan = khan;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", khan='" + khan + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", price=" + price +
                '}';
    }
}
