import java.util.Scanner;

public class q11 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter maximum price to buy device :");
        int max_price= input.nextInt();

        System.out.print("Enter the number of devices you want to test: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the device prices: ");
        int count =0;
        int total =0;

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            if(arr[i]<max_price){
                count=count+1;
                total=total+arr[i];
            }
        }
        System.out.println("The number of devices the company should buy is "+ count);
        System.out.println("The total payment = "+total);
}}
