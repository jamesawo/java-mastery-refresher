public class OutOfBoundsException {
    public static void main(String[] args) {
        // Unchecked exceptions example

        int num[] = { 1, 2, 3, 4 };

        // should throw an OutOfBoundsException
        System.out.println(num[5]);

    }
}
