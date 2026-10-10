import java.util.Scanner;

public class YourFirstBankTransfer {
    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	Account p1 = new Account("Matthews account", 1000);
	Account p2 = new Account("My account", 0);
	
	p1.withdrawal(100);
	p2.deposit(100);
	
	System.out.println(p1.toString() + "\n" + p2.toString());

    }
}