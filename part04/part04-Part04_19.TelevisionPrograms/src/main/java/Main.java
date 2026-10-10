import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	ArrayList<TelevisionProgram> programs = new ArrayList<>();
	while(true) {
	    String programName = read.nextLine();
	    if(programName.equals("")) {
		System.out.println("");
		break;
	    }
	    int programDuration = Integer.valueOf(read.nextLine());
	    programs.add(new TelevisionProgram(programName, programDuration));
	}
	System.out.println("Program's maximum duration?");
	int duration = Integer.valueOf(read.nextLine());
	
	for(TelevisionProgram i : programs){
	    if(i.getDuration() <= duration) {
		System.out.println(i);
	    }
	}
    }
}