/*write a program to find the area and perimeter of the circle */

package Programs;

import java.util.Scanner;

public class area_perimeter_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose what to find \n 1 . Area \n 2 . Perimeter");
        int o = in.nextInt();
        System.out.println("Enter the radius of the circle :");
        int r = in.nextInt();
        double area ,perimeter;
        

        if (o==1) {
            area = 3.14*r*r;
            System.out.println("The area of the circle is :"+area);

        }

        else if (o==2) {
            perimeter = 2*3.14*r;
            System.out.println("The perimeter of the circle is "+perimeter);
        }

        else{
            System.out.println("Invalid selection");
        }


    }
}
