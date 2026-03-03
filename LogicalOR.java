public class LogicalOR {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if(a==10 || b==20)
        {
            System.out.println("At least one condition is true");
        }
        else
        {
            System.out.println("Both conditions are false");
        }

        int c=30;
        int d=40;
        if(c<=20 || d==30)
        {
            System.out.println("At least one condition is true");
        }
        else
        {
            System.out.println("Both conditions are false");
        }
    }
}
