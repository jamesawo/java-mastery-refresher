public class StringBuilderOperator {
    public static void main(String[] args) {

        String palindrome = "Dot saw I was Tod";
        StringBuilder stringBuilder = new StringBuilder(palindrome);

        // The delete(int start, int end) method
        stringBuilder.delete(0, 1);

        // deleteCharAt() method
        stringBuilder.deleteCharAt(2);

        // replace() method
        stringBuilder.replace(3, 5, "rep");

        // append()
        stringBuilder.append("Dot");

        // insert()
        stringBuilder.insert(0, "rem");

        // reverse()
        stringBuilder.reverse();

        System.out.println(stringBuilder);
        System.out.println(reverseString(palindrome));
    }

    // reverse string method
    static String reverseString(String original) {

        int length = original.length();
        char[] chars = new char[length];

        int count = length;
        for (int i = 0; i < length; i++) {
            chars[i] = original.charAt(count - 1);
            count--;
        }
        return new String(chars);
    }
}