import java.util.Scanner;
import java.lang.Math;


public class Cubes {
    public static void main(String[] args){
	Scanner read = new Scanner(System.in);
	
	while(true) {
	    String ans = read.nextLine();
	    if(ans.equals("end")){
		break;
	    }
	    System.out.println((int)Math.pow(Integer.valueOf(ans), 3));
	}
    }
}