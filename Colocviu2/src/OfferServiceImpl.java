import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfferServiceImpl implements OfferService {

    private List<Offer> offerList;

    public OfferServiceImpl() {
        this.offerList = new ArrayList<>();
    }

    @Override
    public List<Offer> findAllByProductName(String name) {
        return offerList.stream().filter(o -> {
            List<Product> products = o.getProducts();
            for(Product p : products) {
                if(p.getName().equals(name.toLowerCase())) {
                    return true;
                }
            }
            return false;
        }).collect(Collectors.toList());
    }

    @Override
    public void create(Offer obj) throws ValidationFailedException {
        if(!obj.getCustomer().equals("") && obj.getProducts().size() != 0) {
            offerList.add(obj);
        } else {
            throw new ValidationFailedException("Offer not valid!");
        }
    }

    @Override
    public List<Offer> search(String field) {
        return offerList.stream().filter(o -> o.getCustomer().startsWith(field)).collect(Collectors.toList());
    }

    @Override
    public boolean delete(Offer obj) throws OfferNotFoundException {
        for(Offer o: offerList) {
            if (o.equals(obj)) {
                this.offerList.remove(obj);
                return true;
            }
        }
        throw new OfferNotFoundException("Nothing here");
    }

    public List<Offer> getOfferList() {
        return offerList;
    }
}
