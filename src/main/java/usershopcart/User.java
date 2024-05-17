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
        if(qty <= product.inventory && qty > 0){
            Map<Product, Integer> productsInCart =  cart.getProducts();        //access the map (cart)
            if(productsInCart.containsKey(product)){
               qty += productsInCart.get(product);
                //productsInCart.put(product, qty);
            }
            productsInCart.put(product, qty);    //add a Map.Entry (product,qty)
            //subtract qty bought from inventory
            product.inventory = product.inventory -  qty; // updating inventory by subtracting 1 qty of product from inventory
            //product.inventory +=  qty;
            //cart.setProducts(productsInCart);
           // System.out.println("Enjoy your " + product.getName());
        }else{

            System.out.println("Unable to add 0 qty");
        }

            //else
        //print message and deny action


    }

    public void removeFromCart(Product product, Integer qty){
        Map<Product, Integer> productsInCart =  cart.getProducts();
        // Check if cart has the particular product
        if(productsInCart.containsKey(product)){
            //check if amt to remove is not > than what you already have in the cart
                if(productsInCart.get(product) < qty){
                    System.out.println("Unable to perform transaction");
                    }else if(qty == productsInCart.get(product)){     //second check to if qty to remove and qty in cart matches
                       //update inventory
                    product.inventory = product.inventory +  qty; // product.setInventory(product.getInventory());
                    productsInCart.remove(product);        // remove the product from the cart
                }else{
                    product.inventory = product.inventory +  qty;
                    int newNumberInCart = productsInCart.get(product) - qty;
                    productsInCart.replace(product, newNumberInCart);
                }
        }else{
            System.out.println("Product not in cart");
        }


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
