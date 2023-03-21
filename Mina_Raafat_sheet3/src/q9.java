import java.util.Scanner;

public class q9 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int posSum=0;
        int negSum=0;
        for (int i = 0; i < size; i++) {
            if( arr[i]>0){posSum=posSum+arr[i];}
            else if(arr[i]<0){negSum=negSum+arr[i];}
        }
        System.out.println("positive sum equals "+posSum);

        System.out.println("negative sum equals "+negSum);}}
