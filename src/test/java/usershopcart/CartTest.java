package usershopcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    private Map<Product, Integer> products;
    private final float TAX = .10f;
    private Special special;
    private User user;
    private Product item1;
    private Product item2;
    private Cart cart;

    @BeforeEach
    void setUp(){
        user = new User();
        item1 = new Hat("Baseball hat", Size.L, 20.00, 100);
        item2 = new Hat("Louis Vuitton Hand Bag", Size.S, 2000.00, 10);
        cart = user.getCart();
        user.addToCart(item1, 2);
        user.addToCart(item2, 1);
    }
    @Test
    void subTotalTest() {
        //given
        Map<Product, Integer> productsMap = user.getCart().getProducts();
        Integer item1Qty = productsMap.get(item1);
        Integer item2Qty = productsMap.get(item2);
        double expected = ( item1.getPrice () * item1Qty ) + (item2.getPrice()  *item2Qty );
        //when
        double actual = cart.subTotal();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void totalAfterTaxTest(){
        //given
        double beforeTax = cart.subTotal();
        double taxAmount = beforeTax * TAX;
        double expected = beforeTax + taxAmount;
        //when
        double actual = cart.totalAfterTax();
        //then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void printSpecialTest(){

    }










}