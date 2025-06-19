/* this program is used to replace specific characters with wanted characters using replaceAll  */

package Programs;

public class alphabet_count {
   
    public static void main(String[] args) {
        String s = "Gowtham@1234";
        int j=0 ; int count = 0;
        String data = s.replaceAll("[0-9]", " ");

        System.out.println(data);
        System.out.println(data.length());
    }
}
