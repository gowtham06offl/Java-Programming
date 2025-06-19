// 90 - 100 grade A+
// 80 - 90 grade A
// 70 - 80 grade B
// 60 - 70 grade C
// 50 - 60 grade D
// Below 50 fail 
package Programs;
import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args) {
        int mark;
        Scanner Mark = new Scanner(System.in);
        System.out.println("Enter the Mark : ");
        mark = Mark.nextInt();

        if (mark>90 || mark==100) {
            System.out.println("Yayy!!! , Your Grade is A+");
        }

        else if (mark>80 || mark==90) {
            System.out.println("Congrats!!! Your Grade is A");
        }

        else if (mark>70 || mark==80) {
            System.out.println("Congrats!!! Your Grade is B");
        }

        else if (mark>60 || mark==70) {
            System.out.println("Congrats!!! Your Grade is C");
        }

        else if (mark>50 || mark==60) {
            System.out.println("Congrats!!! Your Grade is D");
        }

        else{
            System.out.println("Your have Failed in this Subject");
        }

    
    }
}
