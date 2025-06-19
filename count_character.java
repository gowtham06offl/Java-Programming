package Programs;

public class count_character {
    public static void main(String[] args) {
        
        StringBuffer Buffer = new StringBuffer("Gowtham Kumar @ 2005");
        System.out.println("Given Text: "  +Buffer);

        int Lower = 0, Upper = 0 , Vowels =0 , symbols =0 , Spaces =0 , Number =0 ;

        for(int i=0 ; i<Buffer.length() ; i++)
        {
            if(Buffer.charAt(i)>=97 && Buffer.charAt(i)<=122){
                Lower++;
            }

            if (Buffer.charAt(i)>=65 && Buffer.charAt(i)<=90) {
                Upper++;
            }

            if (Buffer.charAt(i) == 32) {
                Spaces++;
            }

            if (Buffer.charAt(i) >=48 && Buffer.charAt(i)<=57){
                Number++;
            }
            
            if (Buffer.charAt(i) == 'A' ||  Buffer.charAt(i) == 'E' || Buffer.charAt(i) == 'I' || Buffer.charAt(i) == 'O' || Buffer.charAt(i) == 'U' || 
                Buffer.charAt(i) == 'a' ||  Buffer.charAt(i) == 'e' || Buffer.charAt(i) == 'i' || Buffer.charAt(i) == 'o' || Buffer.charAt(i) == 'u') {
                
                    Vowels++;
            }
        }

        System.out.println("Upper Case :"+Upper);
        System.out.println("Lower Case :"+Lower);
        System.out.println("Vowels :"+Vowels);
        System.out.println("Spaces :"+Spaces);
        System.out.println("Numbers :"+Number);

        
    }
}
