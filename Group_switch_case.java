import java.util.Scanner;

public class Group_switch_case {
    public static void main(String[] args) {
        System.out.println("Enter the Character : ");
        Scanner in = new Scanner(System.in);
        char Vowel = in.next().charAt(0);

        switch (Vowel){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
        System.out.println(Vowel+ " is a Vowel");
        break;
        
        default:
        System.out.println("Invalid Character ");
        break;
    }
    }
}
