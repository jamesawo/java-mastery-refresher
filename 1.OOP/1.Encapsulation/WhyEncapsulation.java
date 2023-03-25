public class WhyEncapsulation {
    public static void main(String[] args) {

        Person person = new Person();

        // the outside code is only allowed to set age
        person.setAge(0);
        // age will be zero but cannot be negative
        System.out.println(person.toString());

        person.setAge(21);
        // age will be updated now
        System.out.println(person.toString());

    }
}

// why encapsulation is cool.
class Person {
    private int age;

    public void setAge(int age) {
        // checking the age value first
        if (age >= 0) {
            this.age = age;
        }
    }

    public String toString() {
        return "Person{ age: " + age + " }";
    }
}