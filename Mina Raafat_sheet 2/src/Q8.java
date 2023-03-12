import java.util.Scanner;

import static java.lang.Math.abs;

public class Q8 {public static void main(String[] args) {
    double closest=0;
    double middle=0;
    double furthest=0;


    System.out.println("please enter your 3 numbers");
    Scanner input = new Scanner(System.in);
    double firstNum = input.nextDouble();
    double secondNum = input.nextDouble();
    double thirdNum = input.nextDouble();
    double diff1=abs(firstNum-100);
    double diff2=abs(secondNum-100);
    double diff3=abs(thirdNum-100);
    if(diff2>diff1){
        closest=firstNum;
        middle=secondNum;
    }
    else {closest=secondNum;
        middle=firstNum;}

    if(abs(closest-100)>diff3){middle=closest;closest=thirdNum;furthest=middle;}
    else if(abs(middle-100)>diff3){furthest=middle;middle=thirdNum;}
    else {furthest=thirdNum;}
    System.out.println("closest "+closest+" middle "+middle+" furthest "+furthest
    );
}
}
