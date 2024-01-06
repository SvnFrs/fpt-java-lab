import Manager.FruitShopManagement;

/**
 * Main class to run the program.
 *
 * @since 1.0
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        try {
            new FruitShopManagement().CreateTable();
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}