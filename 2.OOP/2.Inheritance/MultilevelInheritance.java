public class MultilevelInheritance {
    public static void main(String[] args) {
        ThirdClassC c = new ThirdClassC();
        c.sayHello();
    }
}

class FirstClassA {
    public void sayHello() {
        System.out.println("Hello from Class A");
    }
}

class SecondClassB extends FirstClassA {
}

class ThirdClassC extends SecondClassB {
}