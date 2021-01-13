import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderImpl {
    public static List<Product> readProducts(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        List<Product> products = new ArrayList<>();

        String line = reader.readLine();
        while (line != null) {
            String[] tokens = line.split(",");
            products.add(new Product(tokens[0].strip(), Double.parseDouble(tokens[1].strip())));

            line = reader.readLine();
        }

        reader.close();

        return products;
    }
}
