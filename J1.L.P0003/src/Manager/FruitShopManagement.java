package Manager;

//import Input.InputManagement;
import Objects.Fruit;
import Table.CustomTable;

import java.util.ArrayList;

public class FruitShopManagement {
    private ArrayList<Fruit> fruitList;
    private final String MenuOption = "Create Fruit, View Orders, Shopping (for buyer), Exit";
    private CustomTable table = new CustomTable();

    public FruitShopManagement() {
        fruitList = new ArrayList<>();
    }
    public void CreateTable() {
        int option = 0; //Variable to store user's option
        do {
            //Create a menu and get user's input
            option = Integer.parseInt(table.createMenu("FRUIT SHOP SYSTEM", MenuOption.split(", "), CustomTable.NUMBER));
            handleChoices(option); //Call the handleChoices method and pass the user's option
        } while (option != 4);
    }

    private void handleChoices(int option) {
        switch (option) {
            case 1:
                createFruit();
                break;
            case 2:
                //View Orders
                break;
            case 3:
                //Shopping
                break;
            case 4:
                //Exit
                System.out.println("Thank you for using our system!");
                System.exit(0);
                break;
        }
    }

    private void createFruit() {
        int fruitID = fruitList.size() + 1;
        Fruit fruit = new Fruit();
        fruit.setFruitID(fruitID);
        fruit.createFruit();
        fruitList.add(fruit);
    }
}
