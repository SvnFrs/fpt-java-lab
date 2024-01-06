package Input;

import java.util.Scanner;

public class InputManagement {
    public String handleOrder() {
        String order = "";
        System.out.print("Do you want to order now (Y/N)? ");
        Scanner sc = new Scanner(System.in);
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
}
