public class RunnableExample {
    public static void main(String[] args) {

        System.out.println("=== RunnableTest ===");

        // Anonymous Runnable
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello world from runner one!");
            }
        };

        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world from runner two!");

        r1.run();
        r2.run();

    }
}
