import java.io.FileNotFoundException;

public class AppleFactory implements GroceryProductFactory {
    double price;
    public AppleFactory() {
        System.out.println("new apple factory created");
    }
   public GroceryProduct makeProduct() throws FileNotFoundException {
        return new Apple(Database.readPriceFromDataFile("apple"));
    }
}
