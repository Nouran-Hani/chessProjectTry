import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
    System.out.println("please enter 3 sides of your triangle");
    Scanner input = new Scanner(System.in);

    double firstSide = input.nextDouble();
    double secondSide = input.nextDouble();
    double thirdSide = input.nextDouble();
        if (firstSide <= 0||secondSide<= 0||thirdSide<= 0) {
            System.out.println("Invalid input. Please enter a valid side lenght");
        } else {
    if(firstSide==secondSide&&secondSide==thirdSide)//three sides are equal
    {System.out.println("your triangle is equilateral");}
    else if(firstSide!=secondSide&&secondSide!=thirdSide&&firstSide!=thirdSide){System.out.println("your triangle is scalene");}
    else {System.out.println("your triangle is isoceles");
}}}}

// Scanner sc=new Scanner(System.in);
//        while (!sc.hasNextInt()){ //refuse any input other than integer
//            System.out.println("I SAID please enter INTRGER number!");
//           sc=new Scanner(System.in);}
//           int  x=  sc.nextInt();

