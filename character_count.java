/* this program shows how to count an specific character in the given string */

package Programs;

public class character_count {
    public static void main(String[] args) {
        String s = "ababcda";
        String target = "a";
        int a = s.length();
        int b = s.replaceAll("a", "").length();

        int count = a-b;
        System.out.println(count);
    }
}
