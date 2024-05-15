package usershopcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Map<Product, Integer> products;
    private final float TAX = .10f;
    private Special special;

    @Test
    void subTotalTest() {
        //given
        Product item1 = new Hat("Baseball hat", Size.L, 20.00, 100);
        Product item2 = new Hat("Louis Vuitton Hand Bag", Size.S, 2000.00, 10);
        User user = new User();
        Map<Product, Integer> productsMap = user.getCart().getProducts();
        user.addToCart(item1, 2);
        user.addToCart(item2, 1);
        Integer item1Qty = productsMap.get(item1);
        Integer item2Qty = productsMap.get(item2);
        Cart cart = user.getCart();
        double expected = ( item1.getPrice () * item1Qty )+ (item2.getPrice()  *item2Qty );
        //when
        double actual = cart.subTotal();
        //then
        Assertions.assertEquals(expected, actual);

    }



}