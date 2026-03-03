public class LogicalAnd {
    public static void main(String[] args) {
        int bodyTemperature = 98;
        if(bodyTemperature > 97 && bodyTemperature < 99)
        {
            System.out.println("Body temperature is normal");
        }
        else
        {
            System.out.println("Body temperature is not normal");
        }

        int a=10;
        int b=20;
        if(a==10 && b==20)
        {
            System.out.println("Both conditions are true");
        }
        else
        {
            System.out.println("At least one condition is false");
        }

        int c=30;
        int d=40;
        if(c<=30 && d>=40)
        {
            System.out.println("Both conditions are true");
        }
        else
        {
            System.out.println("At least one condition is false");
        }
    }
}
