public class MethodOverride {
    public static void main(String[] args) {

        Chase chase = new Chase();
        // call createAccount() method
        chase.createAccount();
        chase.complain();

        DeutscheBank deutscheBank = new DeutscheBank();
        deutscheBank.createAccount();

    }
}

class Bank {

    // method in super class
    public void createAccount() {
        System.out.println("I can create an account for you.");
    }
}

class Chase extends Bank {

    // overriding the create account method
    @Override
    public void createAccount() {

        System.out.println("I can create a Chase account for you");
    }

    public void complain() {
        System.out.println("I can take all your request");
    }
}

class DeutscheBank extends Bank {
    @Override
    public void createAccount() {

        System.out.println("I can create a DeutscheBank account for you");
    }

}
