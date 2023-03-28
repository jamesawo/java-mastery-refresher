public class BoundedType {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum(3, 4, 5));

        System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        System.out.printf("Max of %s, %s and %s is %s\n", "pear",
                "apple", "orange", maximum("pear", "apple", "orange"));
    }

    /*
     * Bounded Type Parameters.
     * 
     * Used to restrict the kinds of types
     * that are allowed to be passed to a type parameter
     */
    static <T extends Comparable<T>> T maximum(T firstInput, T secondInput, T thirdInput) {
        T max = firstInput; // assuming firstInput is initially the largest

        if (secondInput.compareTo(max) > 0)
            max = secondInput;

        if (thirdInput.compareTo(max) > 0)
            max = thirdInput;

        return max;
    }
}
