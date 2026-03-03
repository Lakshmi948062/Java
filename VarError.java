public class VarError 
{
    public static void main(String[] args)
    {
        int x = 14;
        int y = 18;
        System.out.println("The addition of x and y is: "+ x+y);
        int z = x+y;
        System.out.println("The addition of x and y is: "+ z);
        int x = 20;
        System.out.println("The value of x is: "+ z);
    }
}
