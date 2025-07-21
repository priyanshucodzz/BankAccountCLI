class Person1 {
    private String name;
    private int age;

    // Constructor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters to access private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person1 {
    private int rollNumber;
    private int[] marks = new int[5];

    // Constructor using super
    public Student(String name, int age, int rollNumber, int[] marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate average marks
    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nRoll Number: " + rollNumber +
                "\nAverage Marks: " + calculateAverage();
    }
}

public class Person {
    public static void main(String[] args) {
        int[] marks = {90, 85, 88, 92, 80};
        Student s = new Student("Priyanshu", 20, 10, marks);
        System.out.println(s);
    }
}