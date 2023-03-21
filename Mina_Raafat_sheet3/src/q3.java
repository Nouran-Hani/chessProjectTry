import java.util.Scanner;

public class q3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements: ");
        float max=arr[1];
        float min=arr[1];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            if (arr[i]>max){max=arr[i];}
            if (arr[i]<min){min=arr[i];}
        }
        System.out.println(" max number is "+max );
        System.out.println(" min number is "+min);}}
