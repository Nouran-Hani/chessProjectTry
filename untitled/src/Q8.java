import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        System.out.println("please enter measurement in inches");
        Scanner sc=new Scanner(System.in);
        double inIN= sc.nextDouble();
        double inM=inIN*0.0254;
        System.out.println("your converted value in meters = "+inM);
    }
}
