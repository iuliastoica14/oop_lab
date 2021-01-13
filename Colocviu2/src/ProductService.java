import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductService implements AppService<Product> {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(Product create) {
        if(!(create).getName().isEmpty() && (create).getPrice()>0)
                repository.create(create);
        else
            try {
                throw new ValidationFailedException("Produsul nu e valid!");
            } catch (ValidationFailedException e) {
                e.getMessage();
            }
    }

    @Override
    public List<Product> search(String name) {
        List<Product> searchProduct=new ArrayList<>();
        String name2=name.toLowerCase();
        for (String i:repository.getProducts().keySet())
        {
            if(i.startsWith(name2))
                searchProduct.add(repository.getProducts().get(i));
        }
        return searchProduct;
    }

    @Override
    public boolean delete(Product delete) {
        try {
            return repository.delete((Product) delete);
        } catch (ProductNotFoundException e) {
            e.getMessage();
            return false;
        }
    }

    public ProductRepository getRepository() {
        return repository;
    }
}
