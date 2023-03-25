import java.util.List;

public class VarTypeDemo {
    public static void main(String[] args) {
        var userFirstName = "John";
        var userLastName = "Doe";
        var userAge = 32;

        System.out.println("User's age is " + userAge);
        System.out.println("User's first name is  " + userFirstName);
        System.out.println("User's last name is  " + userLastName);

        var list = List.of("one", "two", "three", "four");
        for (var element : list) {
            System.out.println(element);
        }
    }

}