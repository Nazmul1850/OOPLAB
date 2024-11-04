import Array.MulDMatrix;
import Static.Product;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            products.add(new Product());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(products.get(i));
        }
    }
}