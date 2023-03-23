public class BreakStatement {
    public static void main(String[] args) {
        int[] intArray = { 10, 20, 12, 33, 45, 53, 2, 1076, 2000 };
        int search = 12;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == search) {
                System.out.println("Found it at position! " + i);
                break;
            }
        }
        System.out.println("Search complete");
    }
}
