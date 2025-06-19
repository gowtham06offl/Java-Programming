// write a program to find the perfect number 


/* perfect number is nothing but if a number is given the factors needs to be calculated . if we add the factors
 * the same number that the user given will be the answer
 * 
 * if the input is 6
 * the factor of 6 is 1,2,3
 * 
 * if we add the factor it will be 6 . so it is same as input , so it is perfect number.
 */

package Programs;

import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int sum =0;

        for(int i=1 ; i<n ; i++){
            if (n%i==0) {
                sum+=i;
            }
        }
        if (sum==n) {
            System.out.println(n+ " is a perfect number");
        }
        else{
            System.out.println(n+ " is not a perfect number");
        }
    }
    
}
