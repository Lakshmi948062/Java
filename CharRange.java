public class CharRange 
{
    public static void main(String[] args)
    {
        char maxrange = Character.MAX_VALUE;
        char minrange = Character.MIN_VALUE;
        System.out.println("The maximum range of a char is: " + maxrange); 
        System.out.println("The minimum range of a char is: " + minrange);
        char sum1 = (char)(maxrange + 1);
        char sum2 = (char)(minrange - 1);
        System.out.println("The sum of maxrange is: " + sum1); //overflow occurs here
        System.out.println("The sum of minrange is: " + sum2); //underflow occurs here
    }
}
