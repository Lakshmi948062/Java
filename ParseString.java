public class ParseString {
    public static void main(String[] args) {

        String number = "123";

        // Convert string to integer
        int parsedNumber = Integer.parseInt(number);

        System.out.println("String value: " + number);

        // Concatenation (String + int)
        number = number + 1;
        System.out.println("After concatenation: " + number);

        // Arithmetic addition
        parsedNumber = parsedNumber + 1;
        System.out.println("After numeric addition: " + parsedNumber);
    }
}