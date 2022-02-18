package Ecommerce;

public class POMUtils {
    public static String formatProductName(String unformattedName){
        return unformattedName.split("-")[0].trim();
    }
}
