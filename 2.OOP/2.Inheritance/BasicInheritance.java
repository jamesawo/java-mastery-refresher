public class BasicInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        String isInstanceOf = (cat instanceof BasicAnimal) ? "Yes" : "No";

        System.out.println("Is Cat an instance of Animal: " + isInstanceOf);
    }
}

class BasicAnimal {
    // methods and fields
}

// use of extends keyword
// to perform inheritance
class Cat extends BasicAnimal {

    // methods and fields of Animal
    // methods and fields of Dog
}