import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        System.out.println("please enter number of minutes");
        Scanner sc=new Scanner(System.in);

        int num_mins= sc.nextInt();
        int num_hours=num_mins/60;
        int remainder=num_mins%60;
        System.out.println("this is equivalent to "+num_hours+" hours + " +remainder+" minutes");}}