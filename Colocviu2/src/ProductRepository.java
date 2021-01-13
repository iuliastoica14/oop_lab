import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private Map<String,Product> products=new HashMap<>();

    public ProductRepository() {
        this.products = products;
    }

    public void create(Object create) {
        if(create instanceof Product)
            products.put(((Product) create).getName(), (Product) create);
    }


    public boolean delete(Product delete) throws ProductNotFoundException {
        boolean bool=false;
        if(products.containsKey(delete.getName())) {
            products.remove(delete.getName(), delete);
            bool=true;
        }
        else {
            throw new ProductNotFoundException("Produsul nu a fost gasit!");
        }
        return bool;
    }

    public Map<String, Product> getProducts() {
        return products;
    }
}
