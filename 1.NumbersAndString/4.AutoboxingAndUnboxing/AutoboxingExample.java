public class AutoboxingExample {

    public static void main(String[] args) {
        int aInt = 9;

        // autoboxing through method invocation
        System.out.println("9 + 1 = " + addOne(aInt) );

        // through assignment
        Integer bInt = aInt;

        System.out.println(bInt);

    }

    static Integer addOne(Integer i) {
        return i + 1;
    }
}