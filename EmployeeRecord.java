package Programs;

public class EmployeeRecord {

    double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};

       public double calculateAverageSalary() {
           double sum = 0.0;
           for (double s : salary) {
               sum += s;
           }
           return sum / salary.length;
       }

       public void compareSalaryWithAverage() {
           double avg = calculateAverageSalary();
           int greaterCount = 0;
           int lesserCount = 0;

           for (double s : salary) {
               if (s > avg) {
                   greaterCount++;
               } else if (s < avg) {
                   lesserCount++;
               }
           }

           System.out.println("The average salary of the employees is: " + avg);
           System.out.println("The number of employees having salary greater than the average is: " + greaterCount);
           System.out.println("The number of employees having salary lesser than the average is: " + lesserCount);
       }

       public static void main(String[] args) {
           EmployeeRecord er = new EmployeeRecord();
           er.compareSalaryWithAverage();
       }

}