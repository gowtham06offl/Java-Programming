package Programs;

class Employee {
    private int empId;
    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private int experience;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary() {
        double variableComponent = 0;
        if (experience >= 3 && experience < 5) {
            variableComponent = 0.25 * basicPay;
        } else if (experience >= 5) {
            variableComponent = 0.3 * basicPay;
        }
        setSalary(basicPay + hra + variableComponent);
    }
}

class ContractEmployee extends Employee {
    private double wages;
    private int hours;

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calculateSalary() {
        setSalary(wages * hours);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        permanentEmployee.setName("Anil");
        permanentEmployee.setEmpId(101);
        permanentEmployee.setBasicPay(10000);
        permanentEmployee.setHra(1500);
        permanentEmployee.setExperience(3);
        permanentEmployee.calculateSalary();
        System.out.println("Permanent Employee: Your salary is: " + permanentEmployee.getSalary());

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setName("Ankit");
        contractEmployee.setEmpId(102);
        contractEmployee.setWages(500);
        contractEmployee.setHours(10);
        contractEmployee.calculateSalary();
        System.out.println("Contract Employee: Your salary is: " + contractEmployee.getSalary());
    }
}