package usershopcart;

import java.util.Map;

public class User {
    private String name;
    private final int id; //ivars belong to the objects
    private static int sharedId = 0; // look up why is a variable static belong to the class
    private Cart cart;

    public User() {
        sharedId++;
        id = sharedId;
        this.cart = new Cart();
    }

    public void addToCart(Product product, Integer qty){
        //check if qty < inventory before adding entry
        if(qty < product.inventory){
            Map<Product, Integer> productsInCart =  cart.getProducts();        //access the map (cart)
            productsInCart.put(product, qty);    //add a Map.Entry (product,qty)
        }



            //else
        //print message and deny action


    }

    public void removeFromCart(Product product, Integer qty){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public static int getSharedId() {
        return sharedId;
    }

    public static void setSharedId(int sharedId) {
        User.sharedId = sharedId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cart=" + cart +
                '}';
    }
}
