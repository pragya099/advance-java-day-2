import java.util.ArrayList;
class Product {
    private int pid;
    private String productName;
    private double price;
    private int quantity;

    public Product(int pid, String productName, double price, int quantity) {
        this.pid = pid;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getPid() {
        return pid;
    }
}

public class MainEnc {
    public static void main(String[] args){

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






        Product p1 = new Product(1, "Mobile", 20000, 10);

        String result = String.format(
                "Pid=%d, PName=%s, Price=%.2f and Quantity=%d",
                p1.getPid(),
                p1.getProductName(),
                p1.getPrice(),
                p1.getQuantity()
        );

        System.out.println(result);
    }
}//by default every class is a sub class of object class  