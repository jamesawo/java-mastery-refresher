public class UnboxingExample {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(-8);

        // 1. Unboxing through method invocation
        int absoluteValue = getAbsoluteValue(i);
        System.out.println("absolute value = " + absoluteValue);

        Double[] doubles = {3.1416};

        // 2. Unboxing through assignment
        double pi = doubles[0];
        System.out.println("pi = " + pi);
    }

    static int getAbsoluteValue(int i) {
        return i < 0 ? -i : i;
    }
}