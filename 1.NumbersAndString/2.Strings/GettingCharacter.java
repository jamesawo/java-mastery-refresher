public class GettingCharacter {
    public static void main(String[] args) {
        String sample = "Niagara. O roar again!";

        // charAt()
        char charAt = sample.charAt(2);

        // substring
        String roar = sample.substring(11, 15);

        String substring = sample.substring(11);

        System.out.println(charAt);
        System.out.println(roar);
        System.out.println(substring);

    }
}
