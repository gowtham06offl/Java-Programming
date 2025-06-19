import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = in.nextInt();
        int i=1;

        while (i<=num) {
            // i++;
            System.out.println(i);
             i++;
        }
    }
}
