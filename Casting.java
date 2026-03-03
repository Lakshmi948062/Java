public class Casting
{
    public static void main(String[] args)
    {
        int g = 5;
        float h = (float) g; // Explicit casting
        System.out.println("Value of g is: " + g);
        System.out.println("Value of h is: " + h);

        int x = 10;
        double y = x; //implicit casting
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);

        double a = 3.14;
        int b = (int) a; // Explicit casting
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);

        int c = 100;
        byte d = (byte) c; // Explicit casting, may cause data loss
        System.out.println("Value of c is: " + c);

        int e = 128;
        float f = (e/2);
        System.out.println("Value of e is: " + e);
        System.out.println("Value of f is: " + f);
    }
}