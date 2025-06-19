// write a program to convert celcius to fahrenheit

package Programs;

import java.util.Scanner;

public class weather_conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the celcius :");
        int c = in.nextInt();

        double f = (1.8*c)+32; //formula for conversion of celcius to fahrenheit
        System.out.println("The fahrenheat is "+f);
    }
}
