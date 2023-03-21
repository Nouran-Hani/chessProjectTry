import java.util.Scanner;

public class q12 {
    public static void main(String args[]) {

    Scanner input = new Scanner(System.in);
        System.out.print("Please enter size of array :");
    int size= input.nextInt();

    int[] arr = new int[size];
        char[] arr2 = new char[size];
        System.out.println("Enter the grade array elemetns: ");
        int max=arr[1];
        int min=arr[1];
       int max_index=1;
        int min_index=1;
        int count=0;
        int avg=0;

        for (int i = 0; i < size; i++) {
        arr[i] = input.nextInt();
        if(arr[i]<150 && arr[i]>0)//generates second array that checks validity of input
        {arr2[i]='V';}
        else{arr2[i]='I';}
        /////////////////////////
        if (arr[i]>max&&arr2[i]=='V'){max=arr[i];//checks max and min grade and their index
        max_index=i;}
        else if (arr[i]<min&&arr2[i]=='V'){min=arr[i];
        min_index=i;}
        ////////////////////////////
            if (arr[i]>120&&arr2[i]=='V'){
                count=count+1;
            }
            /////////////////////
           if (arr2[i]=='V')
           {avg=avg+arr[i]/size;}}
        System.out.println("The array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        int higher_than_avg=0;
        for (int i = 0; i < size; i++) {
            if (arr[i]>avg&&arr2[i]=='V'){
              higher_than_avg=  higher_than_avg+1;
                System.out.println("the student number "+ (i+1) +" has a valid grade higher than avg");
                            }}


        System.out.println("The highest valid grade ="+max+" and its index is "+max_index);
        System.out.println("The lowest valid great grade ="+min+" and its index is "+min_index);
        System.out.println("the number of students with valid grades greater than 80% ="+count);
        System.out.println("the number of students with valid grades greater than avg "+  higher_than_avg);
}
}

