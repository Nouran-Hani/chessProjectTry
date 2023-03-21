import java.util.Scanner;

public class q13 {
    public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the 1st array: ");
    int size = input.nextInt();
        System.out.print("Enter the size of the 2st array: ");
        int size2 = input.nextInt();
        if (size != size2)
        {
            System.out.println("error,the size of the two arrays must be equal");
        }
        else {

    int[][] arr = new int[size][size];
        int[][] arr2 = new int[size2][size2];
        int[][] arrResult = new int[size][size];

        System.out.println("Enter the first array elements: ");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
        arr[i][j] = input.nextInt();
    }}
            System.out.println("Enter the second array elements: ");

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    arr2[i][j] = input.nextInt();
                }}
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if(arr[i][j]>arr2[i][j]){
                            arrResult[i][j]=1;
                        }
                        else if (arr[i][j]<arr2[i][j]){arrResult[i][j]=2;}
                    else arrResult[i][j]=0;
                    }}
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.println(arrResult[i][j] + " ");
}}}}}
