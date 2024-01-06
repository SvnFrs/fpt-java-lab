package Objects;

import Format.FormatManagement;
import Validate.Validation;

import java.util.Scanner;

public class Fruit {
    private int fruitID;
    private String fruitName;
    private int price;
    private int quantity;
    private String origin;

    public Fruit() {
    }

    public Fruit(int fruitID, String fruitName, int price, int quantity, String origin) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public void createFruit() {
        Validation validation = new Validation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit name please: ");
        do {
            try {
                String fruitName = sc.nextLine().trim();
                if (!validation.isValidFruitName(fruitName)) {
                    System.out.println("Fruit name must be at least 2 characters and not contain any number!");
                    System.out.println("Enter fruit name please: ");
                } else if (validation.isDuplicatedFruitName(fruitName)) {
                    System.out.println("Fruit name must be unique!");
                    System.out.println("Enter fruit name please: ");
                } else {
                    if (fruitName.length() > 7) {
                        fruitName = FormatManagement.TrimAndUpperCaseFirstLetter(fruitName);
                        if (validation.isDuplicatedFruitName(fruitName)) {
                            System.out.println("Fruit name must be unique!");
                            System.out.println("Enter fruit name please: ");
                            continue;
                        }
                    }
                    fruitName = FormatManagement.UpperCaseFirstLetter(fruitName);
                    this.fruitName = fruitName;
                    validation.setFruitNameSet(fruitName);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        } while (true);
        System.out.println("Enter fruit price please: ");
        do {
            try {
                int price = Integer.parseInt(sc.nextLine().trim());
                if (validation.isValidPrice(price)) {
                    System.out.println("Price must be a positive number!");
                    System.out.println("Enter fruit price please: ");
                } else {
                    this.price = price;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        } while (true);
        System.out.println("Enter fruit quantity please: ");
        do {
            try {
                int quantity = Integer.parseInt(sc.nextLine().trim());
                if (!validation.isValidQuantity(quantity)) {
                    System.out.println("Quantity must be a positive number!");
                    System.out.println("Enter fruit quantity please: ");
                } else {
                    this.quantity = quantity;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        } while (true);
        System.out.println("Enter fruit origin please: ");
        do {
            try {
                String origin = sc.nextLine().trim();
                if (!validation.isValidOrigin(origin)) {
                    System.out.println("Origin must be at least 2 characters and not contain any number!");
                    System.out.println("Enter fruit origin please: ");
                } else {
                    if (origin.length() > 7) {
                        this.origin = FormatManagement.TrimAndUpperCaseFirstLetter(origin);
                    }
                    this.origin = FormatManagement.UpperCaseFirstLetter(origin);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        } while (true);
    }

    public int getFruitID() {
        return fruitID;
    }

    public void setFruitID(int fruitID) {
        this.fruitID = fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitID=" + fruitID +
                ", fruitName='" + fruitName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", origin='" + origin + '\'' +
                '}';
    }
}
