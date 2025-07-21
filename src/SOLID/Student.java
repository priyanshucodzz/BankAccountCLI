package SOLID;
public class Student {

    // Required fields
    private String name;
    private String rollNumber;

    // Optional fields
    private int age;
    private String email;
    private String phone;

    // Private constructor
    private Student(Builder builder) {   // 1 usage new
        this.name = builder.name;
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Static nested Builder class
    public static class Builder {
        private String name;             // 2 usages
        private String rollNumber;       //l 2 usages
        private int age;
        private String email;
        private String phone;

        // Builder constructor for required fields
        public Builder(String name, String rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        // Setter-like methods for optional fields
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        // Final build method
        public Student build() {
            return new Student(this);
        }
    }
}
