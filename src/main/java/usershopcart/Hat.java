package usershopcart;

public class Hat extends Clothing implements Wearable{
    public Hat(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }

    @Override
    public boolean isWearable() {
        return false;
    }
}
