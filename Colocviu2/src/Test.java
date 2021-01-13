import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    @org.junit.Test
    public void testSearch()
    {
        ProductRepository repo=new ProductRepository();
        ProductService service=new ProductService(repo);
        service.create(new Product("lapte",5));
        service.create(new Product("banane",10));
        service.create(new Product("oua",10));
        List<Product> search=service.search("la");
        Assert.assertEquals(search.size(),1);
    }

    @org.junit.Test
     public void testCreate(){
        ProductRepository repo = new ProductRepository();
        ProductService productService = new ProductService(repo);
        OfferServiceImpl offerService = new OfferServiceImpl();

        List<Product> products=new ArrayList<>();
        products.add(new Product("LaPtE", 4234.32));
        products.add(new Product("laptE", 1234.321));
        products.add(new Product("laMaie", 1234.321));

        if(products != null) {
            Offer o1 = new Offer("eu", products);
            try {
                offerService.create(o1);
                Assert.assertEquals(offerService.getOfferList().size(),1);
            } catch (ValidationFailedException e) {
                e.getMessage();
            }
        }

    }
}
