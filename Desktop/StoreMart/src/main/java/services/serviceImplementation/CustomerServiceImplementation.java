package services.serviceImplementation;

import entities.Product;
import services.CustomerService;

import java.util.List;

public class CustomerServiceImplementation implements CustomerService {
    @Override
    public List<Product> buyProducts(List<Product> customerCart) {
        return customerCart;
    }
}
