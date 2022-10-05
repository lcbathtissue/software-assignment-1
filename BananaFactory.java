import java.io.FileNotFoundException;

public class BananaFactory implements GroceryProductFactory {
    double price;
    public BananaFactory() {
        System.out.println("new banana factory created");
    }
    public GroceryProduct makeProduct() throws FileNotFoundException {
        return new Banana(Database.readPriceFromDataFile("banana"));
    }
}
