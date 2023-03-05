import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter diameter");
        double x = input.nextDouble();
        System.out.println("please enter height");
        double y = input.nextDouble();
        double area = 3.14 * x * x * y / 4;
        System.out.println(area);
    }
}