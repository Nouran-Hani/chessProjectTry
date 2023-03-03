import java.util.Scanner;
public class MON {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter diameter");
        int x = input.nextInt();
        System.out.println("please enter height");
        int y = input.nextInt();
        double area = 3.14 * x * x * y / 4;
        System.out.println(area);
    }
}