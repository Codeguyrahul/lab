package lab_2march;

public class main_1 {
	
	    public static void main(String[] args) {
	        // Create customers
	        Customer customer1 = new Customer(1, "Raman", 1000);
	        Customer customer2 = new Customer(2, "shyam", 5000);

	        // Set amount for customer1
	        customer1.setAmount(500);

	        // Get amount for customer2
	        customer2.getAmount();

	        // Withdraw amount for customer1
	        customer1.withdrawAmount(1000);

	        // Get amount for customer1
	        customer1.getAmount();
	    }
	}



