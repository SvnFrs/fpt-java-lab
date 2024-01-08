package Manager;

//import Input.InputManagement;
import Input.InputManagement;
import Objects.Fruit;
import Table.CustomTable;
import Table.TableManagement;

import java.util.ArrayList;
import java.util.Objects;

public class FruitShopManagement {
    private ArrayList<Fruit> fruitList;
    private final String MenuOption = "Create Fruit, View Orders, Shopping (for buyer), Exit";
    private CustomTable table = new CustomTable();
    private TableManagement tableManagement = new TableManagement();
    private InputManagement input = new InputManagement();

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
                CreateFruit();
                break;
            case 2:
                //View Orders
                break;
            case 3:
                startShopping();
                break;
            case 4:
                //Exit
                System.out.println("Thank you for using our system!");
                System.exit(0);
                break;
        }
    }

    private void CreateFruit() {
        int fruitID = fruitList.size() + 1;
        Fruit fruit = new Fruit();
        fruit.setFruitID(fruitID);
        fruit.createFruit();
        fruitList.add(fruit);
        if (Objects.equals(input.handleOrder(), "Y")) {
            CreateFruit();
        }
        else {
            CreateTable();
        }
    }

    private void startShopping() {
        tableManagement.displayFruitTable(fruitList);
        int fruitID = input.handleShopping();
        Fruit fruit = fruitList.get(fruitID - 1);
        System.out.println("You selected: " + fruit.getFruitName());
        int quantity = input.handleQuantity();
        if (Objects.equals(input.handleOrder(), "Y")) {
            // save order
            tableManagement.displayFruitTable(fruitList);
        }
        else {
            CreateOrder();
        }
    }

    public void CreateOrder() {
        String tableHeader = "Product     , Quantity   , Price , Amount";
        table.createTH(tableHeader.split(", "));
        table.createTB(tableHeader.split(", "), new String[] {
                "Apple",
                "2",
                "10$",
                "20$"
        });
    }
}
