package entities;

import java.util.List;

public class Customer {

    private int id;

    private String customerName;
    private List<Product> carts;

    public Customer(int id, String customerName, List<Product> carts) {
        this.id = id;
        this.customerName = customerName;
        this.carts = carts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Product> getCarts() {
        return carts;
    }

    public void setCarts(List<Product> carts) {
        this.carts = carts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", carts=" + carts +
                '}';

    }
}
