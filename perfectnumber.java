public class perfectnumber {
    public static void main(String[] args) {
        int num=9,sum=0;

        for(int i=1;i<=(num/2);i++){
            if (num%i==0) {
                sum=sum+i;
            }
        }
        if (sum==num) 
            System.out.println("it is perfect number");
        
        else
            System.out.println("it is not perfect number");
    }
}
