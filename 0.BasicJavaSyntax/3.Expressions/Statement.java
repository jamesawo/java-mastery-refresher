public class Statement {
    public static void main(String[] args) {
        // assignment statement
        double aValue = 8933.234;

        // increment statement
        aValue++;
        System.out.println(aValue);

        // method invocation statement
        System.out.println("Hello World!");

        // object creation statement
        Bicycle myBike = new Bicycle("Mountain bike");
        System.out.println("My bike is a " + myBike.getType());
    }
}

class Bicycle {
    private String type;

    public String getType() {
        return type;
    }

    Bicycle(String bicType) {
        type = bicType;
    }
}
