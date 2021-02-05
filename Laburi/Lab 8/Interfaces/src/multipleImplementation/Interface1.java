package multipleImplementation;

public interface Interface1 {

    default void show()
    {
        System.out.println("show from Interface1");
    }
}
