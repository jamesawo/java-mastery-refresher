
public class CharExample {
    public static void main(String[] args) {

        /*
         * Demonstrating usage for the following method
         * - boolean isLetter(char ch)
         * - boolean isDigit(char ch)
         * - boolean isWhitespace(char ch)
         * - boolean isUpperCase(char ch)
         * - boolean isLowerCase(char ch)
         * - char toUpperCase(char ch)
         * - char toLowerCase(char ch)
         * - toString(char ch)
         */
        char aChar = 'a';
        Character bCharacter = Character.valueOf('a');

        boolean isLetter = Character.isLetter(aChar);
        boolean isDigit = Character.isDigit('1');
        boolean isWhitespace = Character.isWhitespace(' ');
        boolean isUpperCase = Character.isUpperCase('P');
        boolean isLowerCase = Character.isLowerCase('o');
        char toUpper = Character.toUpperCase(aChar);
        char toLowerCase = Character.toLowerCase(toUpper);

        String bString = bCharacter.toString();

        printChar(aChar); // AutoBoxing char to Character
        System.out.println("Is letter " + isLetter);
        System.out.println("Is digit " + isDigit);
        System.out.println("Is whitespace " + isWhitespace);
        System.out.println("Is upper " + isUpperCase);
        System.out.println("Is lower " + isLowerCase);
        System.out.println("To upper " + toUpper);
        System.out.println("To lower " + toLowerCase);
        System.out.println("To String " + bString);

    }

    static void printChar(Character character) {
        System.out.println("Autoboxing -> " + character);
    }

}
