package usershopcart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

   private Map<Product, Integer> products;
   private final float TAX = .10f;
   private Special special;

    public Cart() {
        this.products = new HashMap<>();
    }

    //methods
    public int cartQty(){
        //loop through the cart
        int total = 0;
        for(Integer value: products.values()){
            total += value;
        }
        return total;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
