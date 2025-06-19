/* this program shows how to print jagged array (uneven matrix) */


package Programs;

public class jagged_array {
    public static void main(String[] args) {
        
        int s[][]= {{10,20,30,40}, // for s we are giving two square brackets because we are using two arrays
                   {10,20,30},
                   {10,20,30,40}};

        for(int i=0 ; i<s.length; i++){ 
            for(int j = 0 ; j<s[i].length ; j++){
                System.out.print(" "+s[i][j]);
            }
            System.out.println("");
        }
    }
}
