import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args) {
        
        int a;
        Scanner Vote = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        a = Vote.nextInt();

        if (a>=18) {
            System.out.println("You are eligible to Vote ");
        }

        else{
            System.out.println("You are not eligible to vote ... Minimum age to vote is 18");
        }
    }
}
