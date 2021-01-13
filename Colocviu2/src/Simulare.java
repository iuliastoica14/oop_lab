import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulare {
    public static void main(String[] argv) throws ValidationFailedException {
        List<Product> products = null;
        try {
            products = FileReaderImpl.readProducts("E:\\Faculta\\OOP\\oop_lab\\Colocviu2\\src\\test.txt");
            System.out.println(products.size());
        } catch (IOException e) {
            System.out.println("Could not read from file");
        }

        ProductRepository repo = new ProductRepository();
        ProductService productService = new ProductService(repo);

        OfferServiceImpl offerService = new OfferServiceImpl();

        Product p1 = new Product("LaPtE", 4234.32);
        Product p2 = new Product("laptE", 1234.321);
        Product p3 = new Product("laMaie", 1234.321);

        productService.create(p1);
        productService.create(p2);
        productService.create(p3);

        productService.create(new Product("Ceva111", 420.69));
        System.out.println("Number of product services before delete:"+ productService.getRepository().getProducts().size());
        productService.delete(p2);
        System.out.println("Number of product services after delete:"+ productService.getRepository().getProducts().size());
        productService.create(p2);

        if(products != null) {
            Offer o1 = new Offer("eu", products);

            offerService.create(o1);
            List<Offer> offers = offerService.findAllByProductName("lApTE");
            System.out.println(offers.size()); //  1


        }

        List<Product> productsSearch = productService.search("lA");
        System.out.println(productsSearch.size()); // 2;
    }
}
