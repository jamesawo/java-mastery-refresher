public class Encapsulation {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("James");

        // using methods in the student class to set and get name value;
        System.out.println("Student name is " + student.getName());
    }
}

class Student {
    // private = restricted access
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}