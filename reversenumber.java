public class reversenumber {

    public static void main(String[] args) {
        int number=987654321 , reverse =0;
        while(number!=0){
            int remainder = number%10;
            reverse = reverse *10+remainder;
            number=number/10;
        }
        System.out.println("The reverse is :" +reverse);
    }
}