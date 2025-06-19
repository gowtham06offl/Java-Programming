/*You are developing a number guessing game for a fun application. The game generates a random number
 between 1 and 100.
 The user has to guess the number, and the system will tell the user if the guess is too high, too low,
  or correct. The game continues until the user guesses the correct number.

Game Rules:
The system will generate a random number between 1 and 100.

The user has to enter a guess (a number between 1 and 100).

After each guess, the system will inform the user:

"Too low!" if the guess is less than the target number.

"Too high!" if the guess is greater than the target number.

"Congratulations! You've guessed the number!" if the guess is correct.

The user can keep guessing until they guess correctly.

Write a Java program to implement this guessing game using a while loop.
 */

package Programs;

import java.util.Random;
import java.util.Scanner;

public class ThreadLocalRandomExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random Random = new Random();
        int randomInt = Random.nextInt(100);
        int tempInt=0;

        while(tempInt != randomInt){

            System.out.println("Enter your guess :");
            int guess = in.nextInt();


            if (guess>randomInt) {
                System.out.println("Too High !!");
            }

            else if (guess<randomInt){
                System.out.println("Too Low");
            }

            else{
                System.out.println("Yahh you have found the number !");
            }


        }

        in.close();
        
    }
}
