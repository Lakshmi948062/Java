public class ParseDouble {
    public static void main(String[] args) {
        String num = "3.14";
        double ParsedNum = Double.parseDouble(num); // Convert string to double
        System.out.println("String value: " + num);
        // Concatenation (String + double)
        num = num + 1;  
        System.out.println("After concatenation: " + num);
        // Arithmetic addition
        ParsedNum = ParsedNum + 1;
        System.out.println("After numeric addition: " + ParsedNum);
    }
}
