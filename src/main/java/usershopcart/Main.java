package usershopcart;

public class Main {
    public static void main(String[] args) {

   Product product1 = new Hat("Baseball hat", Size.L, 20.00, 100);
   Product product2 = new Hat("Hammer Pants", Size.M, 50.00, 500);
    //   System.out.println(product1.getId());//   System.out.println(product2.getId());

   User user1 = new User();
   user1.addToCart(product1, 1);
   user1.addToCart(product2, 1);
   user1.addToCart(product1, 2);

   System.out.println(user1.getCart().cartQty());



    }
}
