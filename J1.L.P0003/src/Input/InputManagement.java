//package Input;
//
//import Format.FormatManagement;
//import Objects.Fruit;
//
//import java.util.Scanner;
//
//public class InputManagement {
//    private static final Scanner sc = new Scanner(System.in);
//    public void handleCreateFruitInput(int fruitID) {
//        Fruit fruit = new Fruit();
//        System.out.println("Enter fruit name please: ");
//        do {
//            try {
//                String fruitName = sc.nextLine().trim();
//                if (!isValidFruitName(fruitName)) {
//                    System.out.println("Fruit name must be at least 2 characters and not contain any number!");
//                    System.out.println("Enter fruit name please: ");
//                } else {
//                    if (fruitName.length() > 7) {
//                        fruitName = FormatManagement.TrimAndUpperCaseFirstLetter(fruitName);
//                    }
//                    fruitName = FormatManagement.UpperCaseFirstLetter(fruitName);
//                    break;
//                }
//            } catch (Exception e) {
//                System.out.println("Invalid input!");
//            }
//        } while (true);
//    }
//
//    private boolean isValidFruitName(String fruitName) {
//        return fruitName.length() >= 2 && fruitName.matches("[a-zA-Z ]+");
//    }
//}
