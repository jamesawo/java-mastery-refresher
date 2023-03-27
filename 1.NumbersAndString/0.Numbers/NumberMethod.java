public class NumberMethod {
    public static void main(String[] args) {
        Integer aInteger = 202;

        // intValue()
        // Converts the value of this Number object to the int data type and returns it.

        int intValue = aInteger.intValue();

        // compareTo()
        // Compares this Number object to the argument.
        int compareTo = aInteger.compareTo(30);

        // equals()
        // Determines whether this number object is equal to the argument.
        boolean equals = aInteger.equals(202);

        // valueOf()
        // Returns an Integer object holding the value of the specified primitive.
        Integer valueOf = Integer.valueOf(202);

        int compareTo2 = valueOf.compareTo(aInteger);

        // toString()
        // Returns a String object representing the value of a specified int or Integer.

        String aString = aInteger.toString();

        System.out.println("The intValue() ->" + intValue);
        System.out.println("The compareTo() ->" + compareTo);
        System.out.println("The equals() ->" + equals);
        System.out.println("The valueOf() ->" + valueOf);
        System.out.println("The compareTo() ->" + compareTo2);
        System.out.println("The toString() ->" + aString);

    }
}
