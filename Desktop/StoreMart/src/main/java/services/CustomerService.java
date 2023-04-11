package services;

import entities.Product;

import java.util.List;

public interface CustomerService {

    List<Product> buyProducts(List<Product> customerCart);
}
