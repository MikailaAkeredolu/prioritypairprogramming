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
        return products.size();
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
