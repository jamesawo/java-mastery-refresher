public class LocalVariable {

	public void calculateAge() {
		// age is a local variable only available in calculateAge method
		int age = 0;
		age = age + 7;
		System.out.println("Age is a local variable with value: " + age);
	}

	public static void main( String[] args ) {
		LocalVariable localVariable = new LocalVariable();
		localVariable.calculateAge();
	}
}
