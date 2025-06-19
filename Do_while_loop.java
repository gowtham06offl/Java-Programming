import java.util.Scanner;

public class Do_while_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Limit : ");
        int num = in.nextInt();
        int i = 1;

        do{
            System.out.println(i);
            i++;
        }
        while(i<=num);
    }
}

// do while means . first it will do the steps , after completing the steps it will check the while condition