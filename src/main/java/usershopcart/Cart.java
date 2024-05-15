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
    
    //subtotal
    public double subTotal(){
        double total = 0.0; //a container
        //we need to loop through each product in the map
        for (Map.Entry<Product, Integer> item: products.entrySet()) {
            //get the key of each item in the map
                //get the price of the product by using the key
                double price = item.getKey().getPrice();
              //multiply the price of the product by the number of products
              int numberOfProducts = item.getValue();
            //add the final price of each product to the container
               total += price * numberOfProducts;

        }


         //return total
        return total;
    }

    //totalAfterTax

    //checkout

    //printSpecial



    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
