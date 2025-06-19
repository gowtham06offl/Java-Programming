/* write the program to find the sum and average of the given number 
in which user have to set the limit of the numbers and then it should get the input from the user */

package Programs;

import java.util.Scanner;

public class Sum_and_avg_with_limit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = in.nextInt();
        int sum=0;
        int a;

        for(int i = 1 ; i<=n ; i++){
            System.out.println("Enter the number "+i+ " :");
            a = in.nextInt();
            sum+=a;
        }
        System.out.println("The sum of the values are :"+sum);
        System.out.println("The Average of the values are : "+(sum/n));
    }
}
