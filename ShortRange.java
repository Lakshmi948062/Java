public class ShortRange 
{
    public static void main(String[] args)
    {
        short maxrange = Short.MAX_VALUE;
        short minrange = Short.MIN_VALUE;
        System.out.println("The maximum range of a short is: " + maxrange); 
        System.out.println("The minimum range of a short is: " + minrange);
        short sum1 = (short)(maxrange + 1); 
        short sum2 = (short)(minrange - 1);
        System.out.println("The sum of maxrange is: " + sum1); //overflow occurs here
        System.out.println("The sum of minrange is: " + sum2); //underflow occurs here
    }
}
