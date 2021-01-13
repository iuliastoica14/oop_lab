import java.util.ArrayList;
import java.util.List;

public class Offer extends AbstractEntity{
    private static int COUNTER;
    private String customer;
    private List<Product> products=new ArrayList<>();

    Offer(String customer,List<Product> products)
    {
        super(++COUNTER);
        this.customer=customer;
        this.products=products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice()
    {
        double sum=0;
        for(Product i:products)
        {
            sum+=i.getPrice();
        }
        return sum;
    }

    public String getCustomer() {
        return customer;
    }
}
