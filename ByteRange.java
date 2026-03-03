public class ByteRange 
{
    public static void main(String[] args) 
    {
        byte maxrange = Byte.MAX_VALUE;
        byte minrange = Byte.MIN_VALUE;
        System.out.println("The maximum range of a byte is: " + maxrange);
        System.out.println("The minimum range of a byte is: " + minrange);
        byte sum1 = (byte)(maxrange + 1);
        byte sum2 = (byte)(minrange - 1);
        System.out.println("The sum of maxrange is: " + sum1); //overflow occurs here
        System.out.println("The sum of minrange is: " + sum2); //underflow occurs here
    }
}
