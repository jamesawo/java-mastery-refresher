public class BitwiseAndShiftOperator {

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 25;

        // operate directly on binary representations of num1 and num2
        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Bitwise NOT: " + (~num1));
        System.out.println("Bitwise Left Shift: " + (num1 << 2));
        System.out.println("Bitwise Right Shift: " + (num1 >> 2));
        System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2));

    }
}
