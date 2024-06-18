package org.pmarpuri.java8.fi.product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductImpl {

        private static List< Product > productsList = new ArrayList< Product >();

        public static void main(String[] args) {

                productsList.add(new Product(1, "HP Laptop", 25000f));
                productsList.add(new Product(2, "Dell Laptop", 30000f));
                productsList.add(new Product(3, "Lenevo Laptop", 28000f));
                productsList.add(new Product(4, "Sony Laptop", 28000f));
                productsList.add(new Product(5, "Apple Laptop", 100000f));

                List<Float> collect = Optional.ofNullable(productsList).orElseGet(Collections::emptyList).stream().filter(p -> p.getPrice() > 25000).map(mp -> mp.getPrice()).collect(Collectors.toList());
                System.out.println(collect);
                Double collect1 = Optional.ofNullable(productsList).orElseGet(Collections::emptyList).stream().collect(Collectors.summingDouble(dd->dd.getPrice()));
                System.out.println(collect1);
                //max product price in the list
                 Product product = Optional.ofNullable(productsList).orElseGet(Collections::emptyList).stream().max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).orElseGet(Product::new);
                //Product product = Optional.ofNullable(productsList).orElseGet(Collections::emptyList).stream().max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
                System.out.println("heighest price:"+product.getPrice());
                // min product price
                Product product1 = Optional.ofNullable(productsList).orElseGet(Collections::emptyList).stream().min((productA, productB) -> productA.getPrice() < productB.getPrice() ? -1 : 1).orElseGet(Product::new);
                System.out.println("lowest price in the product"+product1.getPrice());
                // converting list to set
                Set<Float> collect2 = Optional.ofNullable(productsList).orElseGet(Collections::emptyList).stream().map(Product::getPrice).collect(Collectors.toSet());
                System.out.println(collect2);
                // converting lest to map with out filtaration
                Map<Integer, Float> collect3 = Optional.ofNullable(productsList).orElseGet(Collections::emptyList).stream().collect(Collectors.toMap(product3 -> product3.getId(), product3 -> product3.getPrice()));
                System.out.println(collect3);


        }
}
