import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Database {
    public static float readPriceFromDataFile(String queryProductName) throws FileNotFoundException {
        String path = "C:\\Users\\CLX Ra\\IdeaProjects\\software-assignment-1\\src\\product-price-data.txt";
        InputStream is = new FileInputStream(path);
        float price = (float) -1.0;
        try (Scanner sc = new Scanner(is, StandardCharsets.UTF_8.name())) {
            while (sc.hasNextLine()) {
                String productName = null;
                String nextLine = sc.nextLine();
                String[] fileLineContents = nextLine.split(", ", -1);
                if (fileLineContents.length == 2) {
                    productName = fileLineContents[0];
                    price = (float) Double.parseDouble(fileLineContents[1]);
                }
                if(queryProductName.equals(productName)){
                    System.out.println("updated prices for " + queryProductName + " to be " + price);
                }
            }
        }
        return price;
    }
}
