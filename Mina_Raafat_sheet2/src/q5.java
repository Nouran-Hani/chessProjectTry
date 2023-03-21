import java.util.Scanner;

public class q5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter the first array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the second array elements: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {//using nested loops to compare each element to each element
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.println(arr[i] + " is a common element");
                }
            }
        }
}}
