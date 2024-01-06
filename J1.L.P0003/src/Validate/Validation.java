package Validate;

import java.util.HashSet;
import java.util.Set;

public class Validation {
    private static Set<String> fruitNameSet = new HashSet<>();
    public static boolean isValidFruitName(String fruitName) {
        return fruitName.length() > 2 || !fruitName.matches("[a-zA-Z ]+");
    }
    public static boolean isDuplicatedFruitName(String fruitName) {
        return fruitNameSet.contains(fruitName);
    }
    public static boolean isValidPrice(int price) {
        return price <= 0;
    }
    public static boolean isValidQuantity(int quantity) {
        return quantity > 0;
    }
    public static boolean isValidOrigin(String origin) {
        return origin.length() >= 2 && origin.matches("[a-zA-Z ]+");
    }
    public static void setFruitNameSet(String fruitName) {
        Validation.fruitNameSet.add(fruitName);
    }
}
