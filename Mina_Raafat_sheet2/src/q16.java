import java.util.Scanner;

import static java.lang.Math.pow;


public class q16 {
    public static void main(String args[]) {
        System.out.println("enter your number");
        Scanner input = new Scanner(System.in);
        int my_num=input.nextInt();
        int my_num1=my_num;
        int last=my_num%10;//recycling q14 to get first and last digit
        int first=0;
        int digitNum=0;
        for(first=my_num ;my_num1>0;my_num1/=10){
            first=my_num1;
            digitNum++;
        }
        /*System.out.println(digitNum);
        System.out.println(first);
        System.out.println(last);
        */
        int yarab= (int) (last*pow(10,digitNum-1)+(my_num%pow(10,digitNum-1))+first-last);
        System.out.println(yarab);
}}
