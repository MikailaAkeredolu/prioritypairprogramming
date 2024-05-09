package usershopcart;

public class Sweater extends Clothing implements Wearable{
    public Sweater(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }

    @Override
    public boolean isWearable() {
        return false;
    }
}
