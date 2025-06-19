public class Break_continue_statement {
    public static void main(String[] args) {
        for(int i = 1 ; i<=10 ; i++){
            if (i==8) {
                break; // break statement la oru value  kudutha andha number la irundhu break ayidum
            }

            if (i==5) {
                continue;  // continue statement la oru value kudutha andha number ah vitutu mathadhelam print panum
            }
            System.out.println(i);
        }
    }
}
