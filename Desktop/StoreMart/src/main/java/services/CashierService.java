package services;

import entities.Product;
import entities.Reciept;

import java.util.List;

public interface CashierService {

    Reciept sellProducts(List<Product> customerCart);
}
