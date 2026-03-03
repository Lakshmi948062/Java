public class Operators {
    public static void main(String[] args) {
        int a = 1 + 2;

        int b = 10;
        //b=b+10;
        b+=10; //Shorthand operator for addition
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

        //b=b-10;
        b-=10; //Shorthand operator for subtraction
        System.out.println("Value of b: "+b);

        //b=b*10;
        b*=10; //Shorthand operator for multiplication
        System.out.println("Value of b: "+b);

        //b=b/10;
        b/=10; //Shorthand operator for division
        System.out.println("Value of b: "+b);

        b=b%10; //Remainder
        System.out.println("Value of b: "+b);

        b++; //Increment operator
        System.out.println("Value of b: "+b);

        b=33;
        b--; //Decrement operator
        System.out.println("Value of b: "+b);

    }
}
