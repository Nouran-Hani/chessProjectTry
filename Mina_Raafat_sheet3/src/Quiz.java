//Code to take array from user and print the array , sum of elements and square root of sum
//=========================================================================================

import java.util.Scanner;
import java.math.*;

public class Quiz {
    public static void main(String args[]) {

        int[] matrix =take_input();
        double sum=process_input(matrix);
        Print_output(sum,matrix);

        }
        //========================================================================
        //function to take inputs from user
        //=================================
        public static int[] take_input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            System.out.println("please enter element number "+(i+1));
            arr[i] = input.nextInt();
        }
        return arr;
    }
    //=========================================================================================
    //function to process the sum of the array elements
    //=================================================
    public static double process_input(int[] arr)
    {
        int sum=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            sum+=arr[i];
        }

        return (sum );
    }
    //==========================================================================================
    //function to print the array , the sum of the elements and the square root of sum
    //================================================================================
    public static void Print_output(double sum,int[] arr)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("sum = "+sum);
        double sqSum = Math.sqrt(sum);
        System.out.println("square root of sum = "+sqSum );


    }
    //=======================================================================================
}
