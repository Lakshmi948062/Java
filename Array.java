public class Array 
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        arr[1]=5;
        System.out.println("Value at the first index: " +arr[1]);
        arr[0]=11;
        System.out.println("Value at the second index: " +arr[0]);
        arr[2]=14;
        System.out.println("Value at the third index: " +arr[2]);
        System.out.println("Value at the fourth index: " +arr[3]);

        int myarray[] = {1,2,3,4,5};
        System.out.println("Value at the first index: " + myarray[0]);
        System.out.println("Value at the second index: " +myarray[1]); 
        System.out.println("Value at the third index: " +myarray[2]);
        System.out.println("Value at the fourth index: " +myarray[3]);
        System.out.println("Value at the fifth index: " +myarray[4]);

        int arr1[] = {1,2,3,4,5};
        for(int i=0; i<arr1.length; i++)
        {
            System.out.println("Value at the index " +i+ " is: " +arr1[i]);
        }
    }   
}
