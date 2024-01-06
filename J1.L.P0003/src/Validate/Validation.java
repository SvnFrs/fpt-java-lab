package Validate;

import java.util.HashSet;
import java.util.Set;

public class Validation {
    private static Set<String> fruitNameSet = new HashSet<>();
    public boolean isValidFruitName(String fruitName) {
        return fruitName.length() > 2 || !fruitName.matches("[a-zA-Z ]+");
    }
    public boolean isDuplicatedFruitName(String fruitName) {
        return fruitNameSet.contains(fruitName);
    }
    public boolean isValidPrice(int price) {
        return price <= 0;
    }
    public boolean isValidQuantity(int quantity) {
        return quantity > 0;
    }
    public boolean isValidOrigin(String origin) {
        return origin.length() >= 2 && origin.matches("[a-zA-Z ]+");
    }
    public void setFruitNameSet(String fruitName) {
        Validation.fruitNameSet.add(fruitName);
    }
}
