//write the program to find the armstrong numbers between 100 to 999

package Programs;



public class armstrong_between_100to999 {
    public static void main(String[] args) {
        int result , temp , digit1,digit2,digit3 , i;
        for (i=100 ; i<=999 ; i++){
            digit3 = i%10;
            temp = i/10;

            digit2 = temp%10;
            temp=temp/10;

            digit1 = temp%10;

            result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);

            if (result == i) {
                System.out.println(result+" is a armstrong number");
            }
        }
    }
}
