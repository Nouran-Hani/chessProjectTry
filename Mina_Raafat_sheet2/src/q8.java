import java.util.Scanner;

public class q8 {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive and odd number ");
    int myNum = input.nextInt();
    int sum=0;
    if (myNum>0 && myNum%2!=0){
        for (int i = 1; i <= myNum; i++) {
            sum=sum+i;
        }
        System.out.println("your sum equals "+sum);
    }
    else{
        System.out.println("Error! Entered number is not an odd positive number ");}
}}
