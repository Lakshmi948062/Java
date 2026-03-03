public class IntRange 
{
    public static void main(String[] args)
    {
        int maxrange = Integer.MAX_VALUE;
        int minrange = Integer.MIN_VALUE;
        System.out.println("The maximum range of an integer is: " + maxrange);
        System.out.println("The minimum range of an integer is: " + minrange);
        int sum1 = maxrange + 1;
        int sum2 = minrange - 1;
        System.out.println("The sum of maxrange is: " + sum1); //overflow occurs here
        System.out.println("The sum of minrange is: " + sum2); //underflow occurs here
    }
}
