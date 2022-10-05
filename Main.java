import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        final AppleFactory apple_factory = new AppleFactory();
        final BananaFactory banana_factory = new BananaFactory();
        apple_factory.makeProduct();
        banana_factory.makeProduct();
    }
}
