package entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Product {

    private String productName;
    private int id;

    private double price;

    public Product(String productName, int id, double price) {
        this.productName = productName;
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args){

        Product product1 = new Product("MacBook", 123, 2000);
        Product product2 = new Product("Laptop", 124, 3000);
        Product product3 = new Product("Desktop", 12, 4000);
        Product product4 = new Product("Monitor", 124, 5000);

        ArrayList<Product> items = new ArrayList<>();
        File csvfile = new File("items.csv");

//        TO wrtie to a file
        PrintWriter out = null;
        try {
            out = new PrintWriter(csvfile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        out.printf("%s, %s, %s\n", "p-Name","p-Id","p-Price");
        items.add(product1);
        items.add(product2);
        items.add(product3);
        items.add(product4);

        for (Product product : items){
            out.printf("%s, %d, %s\n", product.getProductName(), product.getId(), product.getPrice());
        }
            out.close();

    }
}

