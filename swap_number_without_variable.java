/* write a program to swap the number without using third variable */

package Programs;

import java.util.Scanner;

public class swap_number_without_variable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = in.nextInt();
        System.out.println("Enter the value of b :");
        int b = in.nextInt();

        a = a+b; /* 67+54=121    a=121*/
        b = a-b; /*121-54 = 67  b=67 */
        a = a-b; /* 121 - 67 = 54  a=54 */

        System.out.println("swapped value of a is : "+a);
        System.out.println("Swapped value of b is :"+b);
    }
}
