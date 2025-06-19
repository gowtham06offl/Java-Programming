package Programs;
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
       
        int year;
        Scanner LeapYear = new Scanner(System.in);
        System.out.println(" Enter the Year : ");
        year = LeapYear.nextInt();

        if (year%4==0) {
            System.out.println(year+ " Is a Leap Year");
        }
        else{
            System.out.println(year+ " Is not a Leap Year");
        }

    }
}
