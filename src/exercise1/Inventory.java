package exercise1;

import java.util.LinkedList;

public class Inventory {
    public static LinkedList<String> product = new LinkedList<>();

    public static void main(String[] args) {

        addProduct("grapes");
        addProduct("cherry");
        addProduct("water");
        addProduct("apple");


        removeProduct("grapes");

            searchProduct("apple");


        searchProduct("apple");

        System.out.println(product);


    }

    public static void addProduct(String name) {
        product.add(name);
    }

    public static void removeProduct(String name) {
        product.remove(name);
    }

    public static void searchProduct(String name)  {
        for (String i : product) {
            if (i == name) {
                System.out.println("Такой продукт уже существует");

            }
        }

    }
}
