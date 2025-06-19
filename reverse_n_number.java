// write a program to reverse the n digit number

package Programs;

import java.util.Scanner;

public class reverse_n_number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number needs to be reversed : ");
        int num = in.nextInt();
        int remainder, reverse =0 , n;

        while (num!=0) {
            remainder = num%10;
            reverse = (reverse*10)+remainder;
            num=num/10;
        }
        System.out.println("The Reversed Value are : "+reverse);
    }
}


/* if the given number is 123 . it will store in num . using while loop 
 * if n!=0 means it enters the while loop . so 123 is not equal to 0 then it will come inside the 
 * while loop . now num%10 . 123 is divided by 10 and the remainder will be 3 . it will store in
 * remainder variable . now reverse is given 0 as default . now (0*10 )+remainder that is 3 . so reverse
 * value will be 3 . then num 123 is divided by 10 so the quatient will be 12 . now it will repeat the same 
 * process . it will % by 10 the remainder will be 2 . now the (3*10)+2 then it will be 32. once again this prodcess
 * takes place so the number will be reversed */