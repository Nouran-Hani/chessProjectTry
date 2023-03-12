import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        System.out.println("please enter your number");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        if(num%2==0){
            System.out.println("your number is even");
        }
        else {System.out.println("your number is odd");
    }
}}
