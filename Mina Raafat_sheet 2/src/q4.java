import java.util.Scanner;


public class q4 {

        public static void main(String[] args) {
            System.out.println("please enter your character");
            Scanner scanner = new Scanner(System.in);
            String input;

            do {
                System.out.println("Enter alphabetic input: ");
                input = scanner.nextLine();
            } while (!input.matches("[a-zA-Z]+"));
            if (input.matches("[aeiouAEIOU]")) {
                System.out.println(input + " is a vowel");
            } else {
                System.out.println(input + " is not a vowel");
            }






}}
