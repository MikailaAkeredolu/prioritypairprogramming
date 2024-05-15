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

    //checkout

    //printSpecial
    public void printSpecial(){
        // get the specific day
        String dayOfTheWeek = LocalDate.now().getDayOfWeek().name().substring(0,3);
        Special specialDay = Special.valueOf(dayOfTheWeek);
        //Use switch case the day of the week
          //based on day of the week - print a message
        switch(specialDay){
            case MON :
                System.out.println("20% off");
                break;
            case TUE:
                System.out.println("10% off");
                break;
            case WED:
                System.out.println("5% off");
                break;
            case THU:
                System.out.println("15% off");
                break;
            case FRI:
                System.out.println("11% off");
                break;
            case SAT:
                System.out.println("25% off");
                break;
            case SUN:
                System.out.println("0% off");
                break;
            default:
                System.out.println("No such day");
                break;

        }
    }



    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
