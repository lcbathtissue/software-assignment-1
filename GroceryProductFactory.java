import java.io.FileNotFoundException;

public interface GroceryProductFactory {
    public GroceryProduct makeProduct() throws FileNotFoundException;
}
