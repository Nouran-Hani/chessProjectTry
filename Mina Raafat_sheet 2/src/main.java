import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("please enter your number");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        if(x>0){
        System.out.println("you entered a positive num");
    }
        else if(x<0){
            System.out.println("you entered a negative num");
        }
        else{System.out.println("your number is zero");}
    }}