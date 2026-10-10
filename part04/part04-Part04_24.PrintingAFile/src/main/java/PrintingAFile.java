import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingAFile {
    public static void main(String[] args) {
	
	try(Scanner readFile = new Scanner(Paths.get("data.txt"));){
	    // Files are read in a loop
	    while(readFile.hasNextLine()) {
		String row = readFile.nextLine();
		System.out.println(row);
	    }
	    
	} catch(Exception e){
	    System.out.println("Error: " + e.getMessage());
	}
    }
}



//import java.nio.file.Paths;
//import java.util.Scanner;
//
//public class PrintingAFile {
//
//    public static void main(String[] args) {
//
//        try ( Scanner reader = new Scanner(Paths.get("data.txt"))) {
//
//            while (reader.hasNextLine()) {
//                String line = reader.nextLine();
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//        System.out.println("Error: " + e.getMessage());
//        }
//    }
//}
