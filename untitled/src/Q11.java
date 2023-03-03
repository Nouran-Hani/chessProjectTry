import java.util.Scanner;

import static java.lang.Math.*;

public class Q11 {
    public static void main(String[] args) {
        System.out.println("please enter first integer");

        Scanner sc=new Scanner(System.in);
        while (!sc.hasNextInt()){ //refuse any input other than integer
            System.out.println("I SAID please enter INTRGER number!");
           sc=new Scanner(System.in);}
           int  x=  sc.nextInt();



        System.out.println("please enter second integer");
        sc=new Scanner(System.in);
        while (!sc.hasNextInt()){
            System.out.println("I SAID please enter INTRGER number!");
            sc=new Scanner(System.in);}
             int y=  sc.nextInt();


        System.out.println("sum ="+(x+y));
        System.out.println("difference ="+abs(x-y));
        System.out.println("product ="+(x*y));
        System.out.println("avg ="+(x+y)/2.0);
        System.out.println("max ="+max(x,y));
        System.out.println("min ="+min(x,y));






        
    }
}
