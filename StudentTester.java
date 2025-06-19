package Programs;

public class StudentTester {
    public static void main(String[] args) {
        // Create first object for Input 1
        Student student1 = new Student();
        student1.setStudentId(1001);
        student1.setName("Jacob");
        student1.setQualifyingExamMarks(80);
        student1.setResidentialStatus('H');
        student1.setYearOfEngg(3);

        // Create second object for Input 2
        Student student2 = new Student();
        student2.setStudentId(1002);
        student2.setName("Peter");
        student2.setQualifyingExamMarks(83);
        student2.setResidentialStatus('D');
        student2.setYearOfEngg(2);

        // Display details of student 1
        System.out.println("----- Student 1 Details -----");
        displayStudentDetails(student1);

        // Display details of student 2
        System.out.println("\n----- Student 2 Details -----");
        displayStudentDetails(student2);
    }

    public static void displayStudentDetails(Student student) {
        System.out.println("Student Name    : " + student.getName());
        System.out.println("Student Id      : " + student.getStudentId());
        System.out.println("Qualifying marks: " + student.getQualifyingExamMarks());
        System.out.println("Year of Engineering: " + student.getYearOfEngg());

        if (student.getResidentialStatus() == 'H' || student.getResidentialStatus() == 'h') {
            System.out.println("Residential status: Hostellers");
        } else if (student.getResidentialStatus() == 'D' || student.getResidentialStatus() == 'd') {
            System.out.println("Residential status: Day Scholar");
        } else {
            System.out.println("Residential status: Invalid");
        }
    }
}