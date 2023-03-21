public class q20 {
    public static void main(String[] args) {

        // Printing the upside-down triangle
        for (int i = 5; i >= 1; i--) {
            // Printing spaces before the asterisks to center the triangle
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            // Printing the asterisks for this line
            for (int j = 1; j <= 2*i-1; j+=2) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Reversing and printing the upside-down triangle
        for (int i = 1; i <= 5; i++) {
            // Printing spaces before the asterisks to center the triangle
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            // Printing the asterisks for this line
            for (int j = 1; j <= 2*i-1; j+=2) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

