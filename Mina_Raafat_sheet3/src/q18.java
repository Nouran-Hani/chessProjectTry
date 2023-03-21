import java.util.Scanner;



public class q18 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numberStr = input.next();

        int product = 1;
        for(int i = 0; i < numberStr.length(); i++) {
            char digit = numberStr.charAt(i);

            product =product * Character.getNumericValue(digit);
        }

        System.out.println("The product of digits in the number is: " + product);
    }
}
