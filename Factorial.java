// write a program to find the factorial of the number which the user is giving ?

package Programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 1;
        for(int i=1 ; i<=n ; i++){
            f = f*i;
        }
        System.out.println("The factorial of "+n+ "is : "+f);
        in.close(); // stops the scanner function
    }
}
