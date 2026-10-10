import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	Product p1 = new Product("Banana", 1.1, 13);
	p1.printProduct();
    }
}