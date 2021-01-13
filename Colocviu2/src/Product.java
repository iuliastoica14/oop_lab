public class Product extends AbstractEntity {
    private static int COUNTER;
    private String name;
    private double price;

    Product(String name,double price ) {
        super(++COUNTER);
        this.name=name.toLowerCase();
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
