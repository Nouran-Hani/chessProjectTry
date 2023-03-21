import java.util.Scanner;

public class q15
{
    public static void main(String args[]) {
        System.out.println("enter your number");
        Scanner input = new Scanner(System.in);
        int digitNum=0;
        for(int my_num=input.nextInt();my_num>0;my_num/=10){
            digitNum++;
        }
        System.out.println("digit num = "+(digitNum));
}}
