import java.util.Scanner;

public class q19 {
    public static void main(String args[]) {
        //remember you are working as first row is 0 row
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int size = input.nextInt();

        String[][] arr = new String[size][(2 * size)+1 ];

        /////////////////initialize first row
        int couloum_to_start = size;
        for (int j = 0; j < 2 * size ; j++) {
            if (j == couloum_to_start) {
                arr[0][j] = "1";
            } else {
                arr[0][j] = "0";
            }}
        ////////////////////
            for (int i = 0; i < size; i++) {//setting first couloumn

                arr[i][0] = "0";
            }
            for (int i = 0; i < size; i++) {//setting last couloumn

                arr[i][2*size] = "0";
            }

        //===========================================================
        int parent_value1;
        int parent_value2;
        for (int i = 1; i < size; i++)// i :index rows
        {
            for (int j = 1; j < 2 * size ; j++) { // couloums

// i used this euation to get parent values >>>>>>>> arr[i][j]=arr[i-1][j-1]+arr[i-1][j+1]

                    parent_value1 = Integer.parseInt(arr[i - 1][j - 1]);

                    parent_value2 = Integer.valueOf(arr[i - 1][j + 1]);



                int sum = parent_value1 + parent_value2;
                arr[i][j] = Integer.toString(sum);
            }

        }
        ////////////////print the array
        System.out.println(arr[1][1]);
        System.out.println(couloum_to_start);
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < 2 * size +1; j++) {
                if (arr[i][j].charAt(0)=='0') {// transform zeros to white space
                    System.out.print("   ");
                }
                else{ System.out.print(arr[i][j]+"   ");
                    }

            }
            System.out.println();



}}}