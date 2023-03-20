public class InstanceVariable {

	// this instance variable is visible for any child class.
	public String name;

	// amount variable is visible in InstanceVariable class only.
	private double amount;

	// The name variable is assigned in the constructor.
	public InstanceVariable (String newName) {
		name = newName;
	}

	// The Amount variable is assigned a value.
	public void setAmount(double newAmount) {
		amount = newAmount;
	}

	// This method prints the name and amount values.
	public void printNameAndAmount() {
		System.out.println("name  : " + name );
		System.out.println("amount :" + amount);
	}

	public static void main( String[] args ) {
		InstanceVariable instanceVariable = new InstanceVariable("Jacob");
		instanceVariable.setAmount(1000);
		instanceVariable.printNameAndAmount();
	}
}
