package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

import entities.Product;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // list.forEach(new PriceUpdate());
        // list.forEach(Product::staticPriceUpdate);
        // list.forEach(Product::nonStaticPriceUpdate);
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
        list.forEach(cons);

        list.forEach(System.out::println);

    }
}