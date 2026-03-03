import java.util.Arrays;

public class ArrayReference {
    public static void main(String[] args)
    {
        int[] FirstArray = new int[7];
        int[] SecondArray = FirstArray;
        System.out.println("First Array: "+ Arrays.toString(FirstArray));
        System.out.println("Second Array: "+ Arrays.toString(SecondArray));

        SecondArray[0] = 1;
        System.out.println("New First Array After Modification: "+ Arrays.toString(FirstArray));
        System.out.println("New Second Array After Modification: "+ Arrays.toString(SecondArray));

        modifyArray(SecondArray);
        System.out.println("New updated First Array After Modification: "+ Arrays.toString(FirstArray));
        System.out.println("New updated Second Array After Modification: "+ Arrays.toString(SecondArray));

        SecondArray = new int[5];
        SecondArray[0] = 1;
        System.out.println("New modified First Array After Modification: "+ Arrays.toString(FirstArray));
        System.out.println("New modified Second Array After Modification: "+ Arrays.toString(SecondArray));
    }
    public static void modifyArray(int[] array)
    {
        array[1] = 2;
    }

}
