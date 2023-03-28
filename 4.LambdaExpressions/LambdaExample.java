public class LambdaExample {

    final static String salutation = "Hello! ";

    public static void main(String args[]) {

        // creates an implementation of the GreetingService
        GreetingService greetService1 = message -> System.out.println(salutation + message);
        greetService1.sayMessage("Jomoh");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
