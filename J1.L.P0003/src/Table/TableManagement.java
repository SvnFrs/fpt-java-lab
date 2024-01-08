package Table;

import Objects.Fruit;

import java.util.ArrayList;

public class TableManagement {
    private static CustomTable table = new CustomTable();
    public void displayFruitTable(ArrayList<Fruit> fruitList) {
        if (fruitList.isEmpty()) {
            System.out.println("There is no fruit in the store!");
            return;
        }
        System.out.println("List of Fruit: ");
        String tableHeader = "No., Fruit Name     , Origin   , Price , Quantity";
        table.createTH(tableHeader.split(", "));
        for (Fruit i: fruitList) {
            table.createTB(tableHeader.split(", "), new String[] {
                    i.getFruitID() + "",
                    i.getFruitName(),
                    i.getOrigin(),
                    i.getPrice() + "$" + "",
                    i.getQuantity() + ""
            });
            table.createTF(tableHeader.split(", "));
        }
    }
}
