package lab_2march;

public class Customer {
	
	    private int accountNumber;
	    private String accountName;
	    private double accountBalance;

	    // Constructor
	    public Customer(int accountNumber, String accountName, double accountBalance) {
	        this.accountNumber = accountNumber;
	        this.accountName = accountName;
	        this.accountBalance = accountBalance;
	    }

	    // Create Account
	    public void createAccount(int accountNumber, String accountName, double accountBalance) {
	        this.accountNumber = accountNumber;
	        this.accountName = accountName;
	        this.accountBalance = accountBalance;
	    }

	    // Set Amount
	    public void setAmount(double amount) {
	        this.accountBalance += amount;
	    }

	    // Get Amount
	    public void getAmount() {
	        System.out.println("Account Name: " + this.accountName);
	        System.out.println("Account Balance: " + this.accountBalance);
	    }

	    // Withdraw Amount
	    public void withdrawAmount(double amount) {
	        if (this.accountBalance < amount) {
	            System.out.println("Insufficient balance.");
	        } else {
	            this.accountBalance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        }
	    }
	}


