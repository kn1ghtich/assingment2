package SOMEPACKAGE;
public class Student  extends Person{
    private double gpa;
    // Default constructor
    public Student() {

    }
    // Parameterized constructor
    public Student(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student: " + id + ". " + name + " " + surname;
    }

    //Getters and setters

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
