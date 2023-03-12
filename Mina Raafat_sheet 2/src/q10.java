import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        System.out.println("please enter number of units");
        Scanner input = new Scanner(System.in);
       int unitNum= input.nextInt();
       double sum=0;
       if(unitNum>0){
           sum=0.5*unitNum;}
        if (unitNum>50){sum=sum+0.25*(unitNum-50);}
                if(unitNum>150){sum=sum+(unitNum-150)*0.45;}
                if (unitNum>250){sum=sum+(unitNum-250)*0.3;}
        System.out.println("your total = "+120*sum/100);



       }

    }