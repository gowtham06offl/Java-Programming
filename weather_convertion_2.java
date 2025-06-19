// write a program to convert fahrenheit to celcius

package Programs;

import java.util.Scanner;

public class weather_convertion_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fahrenheit :");
        double f = in.nextDouble();

        double c = (f-32)*5/9;
        System.out.println("The celcius is :"+c);
    }
}
