/*You are building a Weather Advisory system that suggests activities to people based on the weather conditions and temperature. The system takes the following inputs:

Temperature (in Celsius).

Weather Condition (either "Rainy", "Sunny", or "Cloudy").

Based on the conditions, your program should suggest an activity:

Sunny:

If the temperature is above 30°C, suggest: "Perfect day for a beach trip!".

If the temperature is between 20°C and 30°C, suggest: "Great weather for a hike!".

If the temperature is below 20°C, suggest: "How about a picnic in the park?".

Rainy:

If the temperature is above 20°C, suggest: "Time for a cozy indoor activity!".

If the temperature is between 10°C and 20°C, suggest: "Perfect day for a hot drink and a good book!".

If the temperature is below 10°C, suggest: "Stay warm inside, it's cold and rainy!".

Cloudy:

If the temperature is above 25°C, suggest: "Great day for a walk in the park!".

If the temperature is between 15°C and 25°C, suggest: "Perfect weather for some outdoor sports!".

If the temperature is below 15°C, suggest: "Better stay inside, it's a bit chilly for outdoor activities.".
 */

package Programs;

import java.util.Scanner;

public class weather_activities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the weather : \n 1 . Sunny \n 2 . Rainy \n 3 . Cloudy ");
        int weather = in.nextInt();
        System.out.print("Enter the Temperature : ");
        double temperature = in.nextDouble();

        if (weather==1) {
            if (temperature>30) {
                System.out.println("Perfect day for a beach trip!");
            }
            else if (temperature>20 && temperature<30) {
                System.out.println("Great weather for a hike!");
            }
            else{
                System.out.println("How about a picnic in the park?");
            }
        }

        else if (weather ==2) {
            if (temperature>20) {
                System.out.println("Time for a cozy indoor activity!");
            }
            else if (temperature>10 && temperature<20) {
                System.out.println("Perfect day for a hot drink and a good book!");
            }
            else{
                System.out.println("Stay warm inside, it's cold and rainy!");
            }
        }
        else if (weather ==3) {
            if (temperature>25) {
                System.out.println("Great day for a walk in the park!");
            }
            else if (temperature>15 && temperature<25) {
                System.out.println("Perfect weather for some outdoor sports!");
            }
            else{
                System.out.println("Better stay inside, it's a bit chilly for outdoor activities.");
            }
        }
        else{
            System.out.println("Invalid input !!");
        }

        
    }
}
