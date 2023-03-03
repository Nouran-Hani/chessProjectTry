import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        System.out.println("please enter number of days");
        Scanner sc=new Scanner(System.in);

        int num_days= sc.nextInt();
        int num_years= num_days/365;
        System.out.println(num_years+" years");
        int remainder= num_days%365;
        int num_months=remainder/30;
        System.out.println(num_months+" months");
        int remainder2=remainder%30;

        System.out.println(remainder2+" days");



}}
