import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Chocolate", "Food"),
            new Product(2, "Pen", "Stationary"),
            new Product(3, "Shirt", "Clothing"),
            new Product(4, "Watch", "Accessories")
        };

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter product name to search: ");

        String inputName = scanner.nextLine();

        System.out.println("Linear Search:");

        Product linearResult = SearchFunctions.linearSearch(products, inputName);

        if (linearResult != null) {
            System.out.println("Product found: " + linearResult.getProductId() + " - " + linearResult.getProductName() + " (" + linearResult.getCategory() + ")");
        } else {
            System.out.println(inputName + " not found.");
        }

        
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        
        System.out.println("\nBinary Search:");
        Product binaryResult = SearchFunctions.binarySearch(products, inputName);

        if (binaryResult != null) {
            System.out.println("Product found: " + binaryResult.getProductId() + " - " + binaryResult.getProductName() + " (" + binaryResult.getCategory() + ")");
        } else {
            System.out.println(inputName + " not found.");
        }
    }
}
