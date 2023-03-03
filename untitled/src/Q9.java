
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        System.out.println("please enter number of minutes");
        Scanner sc=new Scanner(System.in);
        double num_mins= sc.nextDouble();
        int num_years= (int) (num_mins/(365*24*60));
        double remainder=num_mins%(365*24*60);
        int num_days= (int) (remainder/(60*24));
        System.out.println(num_mins+" is equal to "+num_years+" years and "+num_days+" days");
}}
