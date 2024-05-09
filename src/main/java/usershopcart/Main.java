package usershopcart;

public class Main {
    public static void main(String[] args) {

   Product product1 = new Hat("Baseball hat", Size.L, 20.00, 10);
   Product product2 = new Hat("Hammer Pants", Size.M, 50.00, 5);
    //   System.out.println(product1.getId());//   System.out.println(product2.getId());

   User user1 = new User();
   user1.addToCart(product1, 10);

   Cart cart = new Cart();
   cart.cartQty();


    }
}
