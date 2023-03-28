public class ComparingString {
    public static void main(String[] args) {

        String aString = "Hello";
        String bString = "World";
        String concatString = aString.concat(bString);

        // return true if string ends with a substring
        boolean endsWith = concatString.endsWith(bString);

        // return true if string begins with the substring specified as an argument
        boolean startsWith = concatString.startsWith("Hello");

        // Compares two strings lexicographically. Returns an integer
        // indicating whether this string is greater than, equal to
        // or less than the argument.
        int compareTo = aString.compareTo(bString);

        // Compares two strings lexicographically, ignoring differences in case.
        int compareToIgnoreCase = bString.compareToIgnoreCase("world");

        // Returns true if argument is a String and sequence of characters is same
        boolean equals = concatString.equalsIgnoreCase(aString + bString);

        System.out.println("Ends with: " + endsWith);
        System.out.println("Starts with: " + startsWith);
        System.out.println("CompareTo: " + compareTo);
        System.out.println("compareToIgnoreCase: " + compareToIgnoreCase);
        System.out.println("Equals: " + equals);
    }
}
