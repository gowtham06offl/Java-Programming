package Programs;

public class BillDiscountCalculator {
	public static void main(String[] args) {
        // Input 1
        int billId1 = 1001;
        int customerId1 = 101;
        int discount1 = 2;
        double billAmount1 = 199.99;
        
        double discountedBillAmount1 = billAmount1 - billAmount1 * (discount1 / 100.0);
        System.out.println("Bill ID: " + billId1);
        System.out.println("Customer ID: " + customerId1);
        System.out.println("Discounted Bill Amount: " + discountedBillAmount1);

        System.out.println(); // For spacing

        // Input 2
        int billId2 = 1002;
        int customerId2 = 102;
        int discount2 = 4;
        double billAmount2 = 210.5;
        
        double discountedBillAmount2 = billAmount2 - billAmount2 * (discount2 / 100.0);
        System.out.println("Bill ID: " + billId2);
        System.out.println("Customer ID: " + customerId2);
        System.out.println("Discounted Bill Amount: " + discountedBillAmount2);
    }


}