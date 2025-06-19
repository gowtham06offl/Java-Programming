/* change case of alphabets from small letters to capital letters */

package Programs;

public class change_case {
    public static void main(String[] args) {
        char a[] = "I  bEloNgs  To  vEl  tEch ".toCharArray();
        String s = "";  // empty string
        for(int i=0 ; i<a.length;i++){
            s += Character.toUpperCase(a[i]);
        }

        System.out.println(s);


    }
}



