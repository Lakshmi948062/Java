public class OperPrecedence {
    public static void main(String[] args) {
        int length = 10;
        int breadth = 10;
        int perimeter = 2 * length + breadth; // Operator precedence: multiplication before addition
        System.out.println("Perimeter of the rectangle: " + perimeter); 

        int perimeterWithParentheses = 2 * (length + breadth); // Parentheses change the order of operations
        System.out.println("Perimeter of the rectangle with parentheses: " + perimeterWithParentheses);
    }
}
