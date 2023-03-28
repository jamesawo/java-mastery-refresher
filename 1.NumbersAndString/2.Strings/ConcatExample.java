public class ConcatExample {
    public static void main(String[] args) {
        char[] charArr = { 'h', 'e', 'l', 'l', 'o' };

        String aString = new String(charArr);
        String bString = new String(" World");
        String cString = "Simplest way to create a String";

        // concat()
        String concat = aString.concat(bString).concat(cString);

        // using +
        String concatA = aString + " World";

        String quote = "Now is the time for all good " +
                "men to come to the aid of their country.";

        System.out.println(concat);
        System.out.println(concatA);
        System.out.println(quote);
    }
}
