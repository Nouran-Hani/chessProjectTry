import java.util.Scanner;
import static java.lang.Math.pow;
public class q17 {public static void main(String args[]) {
System.out.println("enter your number");
    Scanner input = new Scanner(System.in);
    int my_num=input.nextInt();
   int my_num1=my_num;
   int my_num2=my_num;
    int digitNum=0;
    for(;my_num1>0;my_num1/=10){
        digitNum++;
    }
    //System.out.println(digitNum);
    for(int i=1 ;i<=digitNum;i++) {
        my_num2= (int) ((my_num%pow(10,i))/(pow(10,i-1)));
        System.out.print(my_num2);
    }}

    }
