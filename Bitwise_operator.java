 //  Bitwise AND = &
    // Bitwise OR = |
    // Bitwise XOR = ^
    // Bitwise NOT = ~

    // Bitwise AND (&) : if there is 2 variables contains a  integer it will convert it into binary and perform
    // AND operation then the output answer is converted back into integer .

    // Bitwise OR (|) : if there is 2 variables contains a  integer it will convert it into binary and perform
    // OR operation then the output answer is converted back into integer 

    // Bitwise XOR (^) : if there is 2 variables contains a  integer it will convert it into binary and perform
    // XOR operation then the output answer is converted back into integer 

    // Bitwise NOT (~) : if there is 2 variables contains a  integer it will convert it into binary and perform
    // NOT operation then the output answer is converted back into integer 

    public class Bitwise_operator {
    
        public static void main(String[] args) {
            int a=10 , b=5;

            System.out.println("Bitwise AND : "+(a&b));
            System.out.println("Bitwise OR : "+(a|b));
            System.out.println("Bitwise XOR : "+(a^b));
            System.out.println("Bitwise NOT : "+(~a));
        }
}
