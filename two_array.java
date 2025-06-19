/* this program is to print the 2 dimensional array into matrix format */

package Programs;

public class two_array {
    public static void main(String[] args) {
        int a[][] = {{10,20,30},
                   {40,50,60},
                   {70,80,90}};
        
        for (int i=0; i<3 ; i++){
            for(int j=0 ; j<3 ;j++){
                System.out.print(" "+a[i][j]); // should use print instead of println to print the numbers horizontally  
            }
            System.out.println("");
        }
    }
}
