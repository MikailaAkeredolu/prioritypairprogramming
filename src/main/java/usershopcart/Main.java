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
   user1.removeFromCart(product1, 2);


        System.out.println(user1.getCart().getProducts());

//   {Product{id=1, name='Baseball hat', size=L, price=20.0, inventory=98}=1, Product{id=2, name='Hammer Pants', size=M, price=50.0, inventory=499}=1}
        System.out.println(user1.getCart().checkout());



    }
}
