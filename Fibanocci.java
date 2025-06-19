/* Write the program to find the fibanocci of the given number */

package Programs;

import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        System.out.println("Enter the Value : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = -1,b = 1,c;
        for( int i = 1 ; i<=n; i++){
            c=a+b; // -1+1 = 0 (first value) , 1+0=1 (second value) , 0+1 = 1 (third value) , 1+1=2(4th value)......
            System.out.println(c);
            a=b; //b=1 so a = 1 , b=0 so a =1 , b=1 so a=1
            b=c; // c=0 so b=0, c = 1 so b =1 , c=2 so b=2

        }
        in.close();
    }
}
