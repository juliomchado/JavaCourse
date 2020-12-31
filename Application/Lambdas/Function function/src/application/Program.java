package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // List<String> uppercaseNames = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        // List<String> uppercaseNames = list.stream().map(Product::staticUppercaseName).collect(Collectors.toList());
        // List<String> uppercaseNames = list.stream().map(Product::nonStaticUppercaseName).collect(Collectors.toList());
        // Function<Product,String> newString = p -> p.getName().toUpperCase();
       
        List<String> uppercaseNames = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        



        uppercaseNames.forEach(System.out::println);

    }
}