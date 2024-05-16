package usershopcart;

import java.time.LocalDate;
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
    public double totalAfterTax(){
        //making a variable or a container
        double total = 0.0;
        //calculate the tax on the products in your cart
        double taxOnProducts  = subTotal() * TAX; // multiply the subtotal by the tax
        //Add the taxOnProducts to subTotal
        total = taxOnProducts + subTotal();    //Store the result where inside total
     //return total
        return total;
    }


    public String getSpecial(){
        // get the specific day
        String today = LocalDate.now().getDayOfWeek().name().substring(0,3);
//        Special specialDay = Special.valueOf(dayOfTheWeek);
        this.special = Special.valueOf(today);
        //Use switch case the day of the week
        //based on day of the week - print a message
        switch(special){
            case MON :
                return "20% off";
            case TUE:
                return "10% off";
            case WED:
               return "5% off";
            case THU:
               return "15% off";
            case FRI:
               return "11% off";
            case SAT:
                return "25% off";
            case SUN:
               return "0% off";
            default:
                return null;

        }
    }

    //checkout
    public String checkout(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Product,Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            Double price = entry.getKey().getPrice();
            stringBuilder
                    .append("name: ").append(product.getName())
                    .append("price: ").append(price)
                    .append("quantity ").append(quantity).append("\n");
        }
        stringBuilder.append(subTotal()).append("\n");
        stringBuilder.append(totalAfterTax()).append("\n");
        return stringBuilder.toString();
    }






    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
