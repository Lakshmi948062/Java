public class LongRange 
{
    public static void main(String[] args)
    {
        long maxrange = Long.MAX_VALUE;
        long minrange = Long.MIN_VALUE;
        System.out.println("The maximum range of a long is: " + maxrange);
        System.out.println("The minimum range of a long is: " + minrange);
        long sum1 = maxrange + 1;
        long sum2 = minrange - 1;
        System.out.println("The sum of maxrange is: " + sum1); //overflow occurs here
        System.out.println("The sum of minrange is: " + sum2); //underflow occurs here
    }
}
