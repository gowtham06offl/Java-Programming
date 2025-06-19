//write a program to find whether the number is strong number or not 

package Programs;

import java.util.Scanner;

public class strong_number {

    public static void main(String[] args) {
        int n ,num ,rem,i,sum=0,fact ,originalNumber;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = in.nextInt();
        originalNumber = n;
        
        while (n>0) {
            rem = n%10;
            fact= 1;
            for(i=1 ; i<=rem ;i++){
                fact*=i;
            }
            sum+=fact;
            n = n/10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber+ " is strong number.");
        }
        else{
            System.out.println(originalNumber+ " is not a strong number.");
        }

    }
}