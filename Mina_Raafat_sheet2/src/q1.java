import java.util.*;

class q1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements: ");
        float sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            sum = sum + arr[i];
        }
        float avg = sum / size;
        System.out.println("you average = " + avg);
    }}

