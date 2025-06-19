//write a program to find the prime number 

package Programs;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = in.nextInt();
        int p = 0;

        for(int i=1 ; i<=n ; i++){
            if (n%i==0) {
                p++;
            }
        }

        if (p==2) {
            System.out.println(n+ " is a prime number.");
        }

        else{
            System.out.println(n+ " is not a prime number.");
        }
    }
}
