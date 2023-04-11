package services.serviceImplementation;

import entities.Product;
import entities.Reciept;
import services.CashierService;

import java.util.List;

public class CashierServiceImplementation implements CashierService {
    @Override
    public Reciept sellProducts(List<Product> customerCart) {
        Reciept customerRecipt = new Reciept();

        double priceSum = 0.0;
        if(customerCart.isEmpty()){
            System.out.println("Your cart is empty");
            return new Reciept(0, 0.0);
        }

       for(Product product : customerCart){
           priceSum += product.getPrice();

           System.out.println(product.getProductName());
            customerRecipt.setNumberOfItems(customerCart.size());
           customerRecipt.setTotalAmount(priceSum);
       }
        return customerRecipt;
    }

}
