public class Parameter {

	public void printMyLastNameOnly(String firstName, String lastName) {
		// firstName and lastName are parameter variables
		System.out.println("Your lastName is: " + lastName);
	}

	public static void main(String[] args) {
		Parameter parameters = new Parameter();
		parameters.printMyLastNameOnly("Jacob", "Marley");
	}
}
