import java.util.List;

public interface AppService <T> {
    public void create(T create) throws ValidationFailedException;

    public List<T> search(String name);

    public boolean delete(T delete) throws OfferNotFoundException;
}
