import java.util.Scanner;

public class q6 {
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
        //equality check
        boolean check = true;
        for (int i = 0; i < size; i++) {
            if (arr[i] == arr2[i]) {
                check = check && true;
            } else {
                check = check && false;
            }
        }
        if (check) {
            System.out.println("the 2 arrays are equal");
        } else {
            System.out.println("the 2 arrays are not equal");
        }
    }}