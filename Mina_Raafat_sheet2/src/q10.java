import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the departure time (hh:mm AM/PM): ");
        String departureTime = scanner.nextLine();

        System.out.print("Enter the arrival time (hh:mm AM/PM): ");
        String arrivalTime = scanner.nextLine();


        int departureHours;
        int departureMinutes;
        int arrivalHours;
        int arrivalMinutes;

        if (departureTime.contains("PM")) {
            departureHours = Integer.parseInt(departureTime.substring(0, 2)) + 12;//.substring extracts the string between index 0 and 2
        } else {
            departureHours = Integer.parseInt(departureTime.substring(0, 2));
        }

        if (arrivalTime.contains("PM")) {
            arrivalHours = Integer.parseInt(arrivalTime.substring(0, 2)) + 12;
        } else {
            arrivalHours = Integer.parseInt(arrivalTime.substring(0, 2));
        }

        departureMinutes = Integer.parseInt(departureTime.substring(3, 5));//parse int converts extracted string to integer
        arrivalMinutes = Integer.parseInt(arrivalTime.substring(3, 5));


        int tripHours = arrivalHours - departureHours;
        int tripMinutes = arrivalMinutes - departureMinutes;
        if (tripMinutes < 0) {
            tripMinutes += 60;
            tripHours--;
        }
        System.out.println("The trip time is " + tripHours + " hours and " + tripMinutes + " minutes.");

    }
}
