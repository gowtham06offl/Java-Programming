// write the program to find all the factorials of the given number


package Programs;

import java.util.Scanner;

public class find_factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();

        for(int i=1 ; i<=n ;i++){
            if (n%i==0) {
                System.out.println("The factors are : " +i);
            }
        }   
    }
}
