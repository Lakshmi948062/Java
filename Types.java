public class Types
{
    public static void main(String[] args)
    {
        int a =10;
        byte b = 2;
        short c = 3;
        long d = 1000 * (a + b + c); // Implicit casting to long
        System.out.println("Value of a is: " + a);  
        System.out.println("Value of b is: " + b);
        System.out.println("Value of c is: " + c);
        System.out.println("Value of d is: " + d);

       // short e = 1000 * (a + b + c);
        short e = (short) (1000 * (a + b + c)); // Explicit casting to short, may cause data loss
        System.out.println("Value of e is: " + e);

        double f =1000 * (a + b + c); // Implicit casting to double
        System.out.println("Value of f is: " + f);

        float g = (float) (1000 * (a + b + c)); // Explicit casting to float
        System.out.println("Value of g is: " + g);
    }    
}
