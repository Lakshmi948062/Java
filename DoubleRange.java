public class DoubleRange 
{
    public static void main(String[] args) 
    {
        double maxrange = Double.MAX_VALUE;
        double minrange = Double.MIN_VALUE;
        System.out.println("The maximum range of a double is: " + maxrange);
        System.out.println("The minimum range of a double is: " + minrange);
        double sum1 = maxrange + 1;
        double sum2 = minrange - 1; 
        System.out.println("The sum of maxrange is: " + sum1); //overflow occurs here
        System.out.println("The sum of minrange is: " + sum2); //underflow occurs here
    }
}
