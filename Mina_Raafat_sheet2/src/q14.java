import java.util.Scanner;

public class q14 {
    public static void main(String args[]) {
        System.out.println("enter your number");
        Scanner input = new Scanner(System.in);
        int my_num = input.nextInt();
        int last=my_num%10;
        int first=0;
        for(first=my_num ;my_num>0;my_num/=10){
        first=my_num;}

        System.out.println("first digit is "+first);
        System.out.println("last digit is "+last);

}}
