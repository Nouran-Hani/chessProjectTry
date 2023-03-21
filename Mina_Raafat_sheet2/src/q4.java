import java.util.Scanner;

public class q4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int[] arrInverse =new int [size];

        System.out.println("Enter the array elements: ");

        for (int i = 0; i < size; i++) {//first loop inputs original array
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {//asign reverse value
            int x=size-1 -i;// i used -1  bcz for example the last element in a array of size 5 is 4,in other words,we begin with 0
            arrInverse[x] = arr[i];
        }
        System.out.println("The reversed array elements are: ");//output
        for (int i = 0; i < size; i++) {
            System.out.print(arrInverse[i] + " ");
        }

}}
