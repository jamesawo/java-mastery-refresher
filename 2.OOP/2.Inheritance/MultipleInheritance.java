// By default multiple inheritance is not supported in Java
// But we can achieve this by using a concept called Composition
class SupperClassJ {
    void sayHello() {
    }
}

class ClassG extends SupperClassJ {
    @Override
    void sayHello() {
        System.out.println("Hello from Class G implementation");
    }
}

class ClassH extends SupperClassJ {
    @Override
    void sayHello() {
        System.out.println("Hello from Class H implementation");
    }
}

// this code will not compile
// class ClassI extends ClassG, ClassH {}

// using Composition we can achieve multiple inheritance
class ClassI {

    SupperClassJ obj;

    ClassI(SupperClassJ classJ) {
        obj = classJ;
    }

    void greet() {
        obj.sayHello();
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        ClassI cl1 = new ClassI(new ClassG());
        ClassI cl2 = new ClassI(new ClassH());

        // using implementation from ClassG
        cl1.greet();

        // using implementation from ClassH
        cl2.greet();

    }
}