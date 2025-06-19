// write a program to find the sum and average of the given numbers ?

package Programs;

import java.util.Scanner;

public class Sum_and_average {
    public static void main(String[] args) {
        float a,b,c,d,sum,avg;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st value : ");
        a = in.nextFloat();
        System.out.println("Enter the 2nd value : ");
        b = in.nextFloat();
        System.out.println("Enter the 3rd value : ");
        c = in.nextFloat();
        System.out.println("Enter the 4th value : ");
        d = in.nextFloat();

        sum = a+b+c+d;
        System.out.println("The Sum of"+a+"+"+b+"+"+c+"+"+d+ "="+sum);   
        avg = (a+b+c+d)/4; // use bracket or wrong answer will come
        System.out.println("The Average of"+a+","+b+","+c+","+d+ "="+avg);   
    }
}
