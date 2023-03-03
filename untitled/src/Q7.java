import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Q7 {

    public static void main(String[] args) {
System.out.println("please enter x-component of point 1");
        Scanner sc=new Scanner(System.in);
        double x1= sc.nextDouble();
        System.out.println("please enter y-component of point 1");
        double y1= sc.nextDouble();
        System.out.println("please enter x-component of point 2");
        double x2= sc.nextDouble();
        System.out.println("please enter y-component of point 2");
        double y2= sc.nextDouble();
        double dist=sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        System.out.println("your distance = "+dist);




}}
