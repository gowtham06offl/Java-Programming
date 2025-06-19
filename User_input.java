import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        boolean a,b,c;
        Scanner Hello = new Scanner(System.in); // S should be capital in Scanner and First letter of name should be capital
        System.out.println("Enter the value of A :");
        a=Hello.nextBoolean();
        System.out.println("Enter the value of B :");
        b=Hello.nextBoolean();
        System.out.println("You have entered A is  :"+a);
        System.out.println("You have entered B is :"+b);
    }
}


//next.Int() for interger inputs
//next.Float() for Float inputs
//next.Boolean() for Boolean inputs
//next() for Word inputs
//next.Line() for line inputs