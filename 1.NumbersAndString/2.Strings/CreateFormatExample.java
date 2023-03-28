public class CreateFormatExample {
    public static void main(String[] args) {
        // Using String's static format()

        float floatVar = 1.0f;
        int intVar = 1;
        String stringVar = "Guten Tag!";

        String fs;
        fs = String.format("The value of the float " +
                "variable is %f, while " +
                "the value of the " +
                "integer variable is %d, " +
                " and the string is %s",
                floatVar, intVar, stringVar);

        System.out.println(fs);
    }
}
