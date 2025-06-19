import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your Choice : ");
        Scanner in = new Scanner(System.in);
        int Choice = in.nextInt();
        System.out.println("Enter the Value of A : ");
        int a = in.nextInt();
        System.out.println("Enter the value of B : ");
        int b = in.nextInt();
        int C;

        switch (Choice) {
            case 1:
                C = a+b;
                System.out.println("The addition of two numbers are : "+C);
                break;
            case 2:
                C = a-b;
                System.out.println("The Subtraction of two numbers are : "+C);
                break;
            case 3:
                C = a*b;
                System.out.println("The Multiplication of two numbers are : "+C);
                break;
            case 4:
                C = a/b;
                System.out.println("The Division of two numbers are : "+C);
                break;

        
            default:
            System.out.println("Invalid Choice");
                break;
        }


    }
}
