import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        System.out.println("please enter degree in Fahrenheit");
        Scanner sc=new Scanner(System.in);
        double fTemp= sc.nextInt();
        double cTemp=(5.0/9.0)*(fTemp-32);
        System.out.println("converted value to celesius = "+cTemp);
    }}
