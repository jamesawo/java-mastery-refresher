public class HierarchicalInheritance {
    public static void main(String[] args) {
        FirstChild firstChild = new FirstChild();
        SecondChild secondChild = new SecondChild();

        firstChild.sayHello();
        secondChild.sayHello();

    }
}

class ParentClass {
    public void sayHello() {
        System.out.println("Hello from ParentClass");
    }
}

class FirstChild extends ParentClass {
}

class SecondChild extends ParentClass {
}
