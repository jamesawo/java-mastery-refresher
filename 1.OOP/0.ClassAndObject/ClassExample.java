public class ClassExample {
    public static void main(String[] args) {

        // create an instance of a class
        Animal firstAnimal = new Animal();
        firstAnimal.eat();
        firstAnimal.move();

        Animal secondAnimal = new Animal();
        secondAnimal.eat();

    }
}

class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat!");
    }

    public void move() {
        System.out.println("I can move!");
    }
}