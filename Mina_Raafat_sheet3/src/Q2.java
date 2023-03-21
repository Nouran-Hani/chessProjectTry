import java.util.Scanner;

public class Q2 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number you want to check");
        Scanner mynum = new Scanner(System.in);
        int num = mynum.nextInt();
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();

        }
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                System.out.println("your number is present");
                found = true;
                break;
            }
        }

            if (found == false) {
                System.out.println("your number is missing");
            }

    }
}