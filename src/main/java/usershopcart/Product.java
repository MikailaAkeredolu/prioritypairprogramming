package usershopcart;

public abstract class Product {
  private final int id; //ivars belong to the objects
  private static int sharedId = 0; // look up why is a variable static belong to the class
  private String name;
  private Size size;

  private double price;

  protected int inventory;

    public Product(String name, Size size, double price, int inventory) {
        sharedId++;
        id = sharedId;
        this.name = name;
        this.size = size;
        this.price = price;
        this.inventory = inventory;
    }

    public int getId() {
        return id;
    }

    public static int getSharedId() {
        return sharedId;
    }

    public static void setSharedId(int sharedId) {
        Product.sharedId = sharedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", inventory=" + inventory +
                '}';
    }
}
