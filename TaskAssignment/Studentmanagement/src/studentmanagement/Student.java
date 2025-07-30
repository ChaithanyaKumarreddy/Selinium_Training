package studentmanagement;

public class Student extends Person implements Printable {
    private String studentId;
    private double grade;

    public Student(String name, int age, String studentId, double grade) {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public void printDetails() {
        System.out.println("Student ID: " + studentId + 
                           ", Name: " + name + 
                           ", Age: " + age + 
                           ", Grade: " + grade);
    }
}
