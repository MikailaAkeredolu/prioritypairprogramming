package usershopcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private Product product1;
    private User user1;

    @BeforeEach
    void setUp(){
        product1 = new Hat("Baseball hat", Size.L, 20.00, 100);
        user1 = new User();
    }

    @Test
    void addToCart() {

        //given
//        Product product1 = new Hat("Baseball hat", Size.L, 20.00, 100);
//        User user1 = new User();
        //Expected
        int expected = 1;
        //when
        user1.addToCart(product1, 1);

        int actual = user1.getCart().cartQty();

        //then
        assertEquals(expected,actual);


    }

    @Test
    void removeFromCart() {
        //given
        int expected = 9;
        user1.addToCart(product1, 10);
        //when
        user1.removeFromCart(product1, 1);

        int actual = user1.getCart().cartQty();

        //then
        assertEquals(expected, actual);
    }
}