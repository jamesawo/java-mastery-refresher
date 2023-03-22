public class Expression {
    public static void main(String[] args) {

        // examples of expressions in java
        int cadence = 0;

        int[] anArray = { 10, 20 };
        System.out.println("Element 1 at index 0: " + anArray[0]);

        int result = 1 + 2; // result is now 3
        cadence = result - 1;

        char value1 = 'a';
        char value2 = 'b';

        if (value1 == value2) {
            System.out.println("value1 == value2");
        }

        System.out.println(String.format("Result is %d", result));
        System.out.println(String.format("Cadence is %d", cadence));
    }
}
