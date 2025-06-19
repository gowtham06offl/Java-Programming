//write the program to find the armstrong number

package Programs;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = in.nextInt();
        int temp = number;
        int digit1,digit2,digit3;

        digit3=temp%10;
        temp = temp/10;

        digit2 = temp%10;
        temp = temp/10;

        digit1 = temp%10;
        

        int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);

        if (number == result) {
            System.out.println(number+ " is a armstrong number.");
        }
        else{
            System.out.println(number+ " is not a armstrong number.");
        }
        in.close();
    }
}
