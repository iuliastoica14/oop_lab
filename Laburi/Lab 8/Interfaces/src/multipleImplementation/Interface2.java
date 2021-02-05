package multipleImplementation;

public interface Interface2 {

    default void show()
    {
        System.out.println("show from Interface2");
    }
}
