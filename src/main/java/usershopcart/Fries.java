package usershopcart;

public class Fries extends Food implements Perishable{

    public Fries(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }

    @Override
    public boolean isPerishable() {
        return true;
    }
}
