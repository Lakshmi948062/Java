public class Reference
{
    public static void main(String[] args) 
    {
        int firstNum=90;
        int secondNum=firstNum;
        System.out.println("First Number: "+firstNum);
        System.out.println("Second Number: "+secondNum);

        secondNum=secondNum;
        System.out.println("Second Number 2: "+secondNum);
        
        secondNum=secondNum + 1;
        System.out.println("Second Number 3: "+secondNum);
    }
}