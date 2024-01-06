package Input;

import java.util.Scanner;

public class InputManagement {
    private final Scanner sc = new Scanner(System.in);
    public String handleOrder() {
        String order = "";
        System.out.print("Do you want to order now (Y/N)? ");
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
            System.out.print("Please enter only Y or N please! ");
            input = sc.nextLine();
        }
        if (input.equalsIgnoreCase("Y")) {
            order = "Y";
        }
        if (input.equalsIgnoreCase("N")) {
            order = "N";
        }
        return order;
    }

    public int handleShopping() {
        int fruitID = 0;
        System.out.print("Enter fruit ID: ");
        String input = sc.nextLine();
        while (!input.matches("[0-9]+")) {
            System.out.print("Please enter only number please! ");
            input = sc.nextLine();
        }
        fruitID = Integer.parseInt(input);
        return fruitID;
    }
    public int handleQuantity() {
        int quantity = 0;
        System.out.print("Enter quantity: ");
        String input = sc.nextLine();
        while (!input.matches("[0-9]+")) {
            System.out.print("Please enter only number please! ");
            input = sc.nextLine();
        }
        quantity = Integer.parseInt(input);
        return quantity;
    }
}
