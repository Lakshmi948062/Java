public class FloatRange 
{
    public static void main(String[] args) 
    {
        float maxrange = Float.MAX_VALUE;
        float minrange = Float.MIN_VALUE;
        System.out.println("The maximum range of a float is: " + maxrange);
        System.out.println("The minimum range of a float is: " + minrange);
        float sum1 = maxrange + 1;
        float sum2 = minrange - 1;
        System.out.println("The sum of maxrange is: " + sum1); //overflow occurs here
        System.out.println("The sum of minrange is: " + sum2); //underflow occurs here
    }
}
