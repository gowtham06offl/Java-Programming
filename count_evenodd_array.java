/* write a program to count the even and odd numbers in a array. get the limit and also the array values 
 * from user ..
 */

package Programs;

import java.util.Scanner;

public class count_evenodd_array {
    public static void main(String[] args) {
        int e=0,o=0;
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the limit :");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i=0 ; i<n ;i++){
            System.out.println("Enter the a["+i+"] value :");
            a[i] = in.nextInt();
        }
        for( int element :a){
            if (element%2==0) {
                e++;
            }
            else{
                o++;
            }
        }

        System.out.println("The count of even number in the array :"+e);
        System.out.println("The count of odd number in the array :"+o);
    }
}
