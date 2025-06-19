import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        char MartialStatus = in.next().charAt(0);
        if (MartialStatus=='U'|| MartialStatus=='u') {
            System.out.println("Enter the Gender M/F : ");
            char Gender = in.next().charAt(0);
            System.out.println("Enter the Age : ");
            int Age = in.nextInt();
            if ((Gender == 'M' || Gender == 'm')&& Age>=30) {
                System.out.println("You are eligible for Insurance");
            }
            else if ((Gender == 'F' || Gender == 'f') && Age>=25) {
                System.out.println("You are eligible for Insurance");
            }
            else{
                System.out.println("Invalid");
            }
        }

        else{
            System.out.println("You are not eligible for Insurance");
        }
        in.close();
    }
}
