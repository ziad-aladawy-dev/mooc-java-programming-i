import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	int number = 0;

	Statistics s1 = new Statistics();
	Statistics s2 = new Statistics();
	Statistics s3 = new Statistics();

	
	
	System.out.println("Enter numbers:");

	while(true){
	    number = Integer.valueOf(read.nextLine());
	    if(number == -1){
		break;
	    }else if(number % 2 == 0){
		s2.addNumber(number);
	    }else if (number % 2 != 0) {
		s3.addNumber(number);
	    }
	    s1.addNumber(number);
	}
	System.out.println("Sum: " + s1.sum());
	System.out.println("Sum of even numbers: " + s2.sum());
	System.out.println("Sum of odd numbers: " + s3.sum());
    }
}