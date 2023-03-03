import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        System.out.println("please enter distance in meters");
        Scanner sc=new Scanner(System.in);
        double dist= sc.nextDouble();
        System.out.println("please enter hours");
        double hours_converted= sc.nextDouble()*60*60;

        System.out.println("please enter minutes");
        double minutes_converted= sc.nextDouble()*60;
    System.out.println("please enter seconds");
    double seconds= sc.nextDouble();

    double totalTime_in_Seconds=seconds+hours_converted+minutes_converted;
    double velocity=dist/totalTime_in_Seconds;
    double velocity_converted=velocity*(18.0/5.0);
        System.out.println("Your speed in meters/second is "+velocity);
        System.out.println("Your speed in km/h is "+velocity_converted);

}}
