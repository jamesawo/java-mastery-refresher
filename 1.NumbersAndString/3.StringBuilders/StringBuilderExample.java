public class StringBuilderExample {

    public static void main(String[] args) {

        String aString = "Hello World";

        // creates empty builder, capacity 16
        StringBuilder emptyStringBuilder = new StringBuilder();
        System.out.println("First string builder " + emptyStringBuilder);
        System.out.println("First string builder capacity " + emptyStringBuilder.capacity());

        // creates a string builder from the aString
        StringBuilder sb2 = new StringBuilder(aString);
        System.out.println("Second string builder " + sb2);
        System.out.println("Second string builder capacity " + sb2.capacity());

        // creates empty builder, capacity 10
        StringBuilder stringBuilderWithCapacity = new StringBuilder(10);
        System.out.println(stringBuilderWithCapacity.capacity());

    }

}