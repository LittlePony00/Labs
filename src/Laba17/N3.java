package Laba17;

import java.util.*;

public class N3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] persons = scn.nextLine().split(" ");
        Map<String, List<Product>> map = new TreeMap<>(new ShopComparator());
        List<Product> list = new ArrayList<>();

        while (!persons[0].equalsIgnoreCase("stop")){
            String name = persons[0];

            if (map.containsKey(name)){
                list = map.get(name);
            }

            list.add(new Product(persons[1], Float.parseFloat(persons[2])));
            list.sort(new ProductsComparator());
            map.put(name, list);
            list = new ArrayList<>();
            persons = scn.nextLine().split(", ");
        }

        System.out.println(map);

        for (String shop : map.keySet()) {
            System.out.println(shop + "->");
            for (Product s : map.get(shop)) {
                System.out.println("product: " + s.getProduct() + ", price: " + s.getPrice());
            }
        }
    }
}
