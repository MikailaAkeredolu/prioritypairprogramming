package usershopcart;

public class Shirt extends Clothing implements Wearable{
    public Shirt(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }

    @Override
    public boolean isWearable() {
        return false;
    }
}
