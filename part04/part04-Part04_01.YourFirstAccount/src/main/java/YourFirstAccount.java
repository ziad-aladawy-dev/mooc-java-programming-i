import java.util.Scanner;

public class YourFirstAccount {
    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	// Create a new account
	// public Account(String owner, double balance)
	Account p1 = new Account("John Doe", 100);
	
	// Deposit some money
	// public void deposit(double amount)
	p1.deposit(20);
	System.out.println(p1.toString());
	
	
    }
}
