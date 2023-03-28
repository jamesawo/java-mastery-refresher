public class GenericMethod {

    public static void main(String[] args) {

        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        Tool[] tools = { new Tool("Hammer"), new Tool("Screwdriver") };

        System.out.println("Array integerArray contains:");
        print(intArray); // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        print(doubleArray); // pass a Double array

        System.out.println("\nArray characterArray contains:");
        print(charArray); // pass a Character array

        System.out.println("\nArray tools contains:");
        print(tools);

    }

    /*
     * Generic Method
     * You can write a single generic method declaration that can be called with
     * arguments of different types. Based on the types of the arguments passed to
     * the generic method, the compiler handles each method call appropriately.
     * 
     */

    static <E> void print(E[] inputEs) {
        System.out.printf("[ ");
        for (int i = 0; i < inputEs.length; i++) {
            String comma = i == inputEs.length - 1 ? "" : ",";
            System.out.printf(" %s%s ", inputEs[i], comma);
        }
        System.out.printf(" ]");
        System.out.println();
    }

}

class Tool {
    String name;

    Tool(String toolName) {
        name = toolName;
    }

    @Override
    public String toString() {
        return name;
    }
}
