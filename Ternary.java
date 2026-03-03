public class Ternary {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int max=(a>b)?a:b; //Ternary operator
        System.out.println("Maximum value: "+max);

        int c=30;
        int d=22;
        int e=50;

        int largest = (c>d && c>e) ? c : (d>c && d>e) ? d :e; //Nested ternary operator
        System.out.println("Largest value: "+largest); 

        int truckheight=15;
        boolean truck=truckheight==15?true:false;
        //System.out.println(truck);
        if(truck)
        {
            System.out.println("Truck can pass under the bridge");
        }
        else
        {
            System.out.println("Truck cannot pass under the bridge");
        }
    }
}
