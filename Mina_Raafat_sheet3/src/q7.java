import java.util.Scanner;

public class q7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i < size; i++) {
           if( arr[i]%2==0){evenSum=evenSum+1;}
           else{oddSum=oddSum+1;}
        }
        System.out.println("even sum equals "+evenSum);

        System.out.println("odd sum equals "+oddSum);}}
