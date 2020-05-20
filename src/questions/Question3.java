package questions;

public class Question3 {

    /**
     * Question 3:
     * Write method to return abbreviation for any given string:
     * Example: String msg = "Outfit of the day"
     * Expected: OOTD
     */

    public static void main(String[] args) {

        String msg = "Outfit of the day";
        System.out.println(abbreviation(msg));
    }

    public static String abbreviation(String string) {
        String[] array = string.split(" ");
        StringBuilder abr = new StringBuilder();
        for (String s : array) {
            abr.append(s.charAt(0));
        }
        return abr.toString().toUpperCase();
    }
}
