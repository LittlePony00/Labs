package Laba17;

import java.util.Comparator;

public class ProductsComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProduct().compareTo(o2.getProduct());
    }
}
