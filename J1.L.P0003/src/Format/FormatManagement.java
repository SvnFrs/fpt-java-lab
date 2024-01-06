package Format;

public class FormatManagement {
    public static String UpperCaseFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
    public static String TrimAndUpperCaseFirstLetter(String input) {
        return input.trim().substring(0, 1).toUpperCase() + input.trim().substring(1,6).toLowerCase();
    }
}
