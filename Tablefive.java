public class Tablefive
{
    public static void main(String[] args)
    {
        int i;
        int[] myarray = new int[11];
        for(i=1;i<myarray.length;i++)
        {
            myarray[i] = i * 5;
            System.out.println("5" + "X" + i + "=" + myarray[i]);
        }
    }
}