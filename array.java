import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = in.nextInt();
        int a[] = new int[n]; /*setting the limit of the array */

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter  the a["+i+"] value :");
            a[i] = in.nextInt(); /* the each number the user giving is stored in array */
        }

        for(int element : a){ /* enhanced for loop . where the element is gaining the a values  */
            System.out.println(element);
        }

    }
}
