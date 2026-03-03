public class TableOne
{
    public static void main(String[] args)
    {
        int i;
        int myarray[] = new int[11];
        for(i=1 ; i<myarray.length; i++)
        {
            myarray[i] = i*10;
            System.out.println("10" + " X " + i + " is = " +myarray[i]);
        }
    }
}