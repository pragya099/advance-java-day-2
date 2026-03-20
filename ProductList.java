import java.util.ArrayList;

public class ProductList {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings to hold product names
        ArrayList<String> products = new ArrayList<>();

        // 2. Insert 5 products into the list
        products.add("Laptop");
        products.add("Smartphone");
        products.add("Wireless Headphones");
        products.add("Smartwatch");
        products.add("Gaming Mouse");

        // 3. Print the products
        System.out.println("Product Inventory:");
        for (String product : products) {
            System.out.println("- " + product);
        }
    }
}