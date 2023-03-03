import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("please enter number of cars");
        Scanner x=new Scanner(System.in);
        double num_cars= x.nextInt();
        System.out.println("please enter capacity of garage");
        Scanner c=new Scanner(System.in);
        double cap= c.nextInt();
        double req=num_cars / cap;

        System.out.println("required garages ="+Math.ceil(req));
    }
}
