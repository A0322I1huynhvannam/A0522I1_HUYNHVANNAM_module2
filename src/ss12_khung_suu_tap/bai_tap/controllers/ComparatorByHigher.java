package ss12_khung_suu_tap.bai_tap.controllers;

import ss12_khung_suu_tap.bai_tap.models.Product;

import java.util.Comparator;

public class ComparatorByHigher  implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() > o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
