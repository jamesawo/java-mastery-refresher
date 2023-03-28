
public class ConvertNumbersExample {
    public static void main(String[] args) {
        String number1String = "12";
        String number2String = "10";

        int[] numbersArr = convertStringsToNumbers(number1String, number2String);
        System.out.println("Number 1: " + numbersArr[0]);
        System.out.println("Number 2: " + numbersArr[1]);

        String[] stringsArr = convertNumbersToString(numbersArr[0], numbersArr[1]);

        boolean number1Equals = stringsArr[0].equals(number1String);
        boolean number2Equals = stringsArr[1].equals(number2String);

        System.out.println("Number 1 equals " + number1Equals);
        System.out.println("Number 2 equals " + number2Equals);
    }

    static int[] convertStringsToNumbers(String number1String, String number2String) {
        int number1Int = Integer.parseInt(number1String);
        int number2Int = Integer.parseInt(number2String);

        int sum = number1Int + number2Int;
        System.out.println("Sum: " + sum);
        int[] intArr = { number1Int, number2Int };
        return intArr;
    }

    static String[] convertNumbersToString(int number1, int number2) {
        String[] strings = { String.valueOf(number1), String.valueOf(number2) };
        return strings;
    }
}
