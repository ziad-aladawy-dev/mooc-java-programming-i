import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class IsItInTheFile {
    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	ArrayList<String> fileContent = new ArrayList<>();
	
	System.out.println("Name of the file:");
	String fileName = read.nextLine();
	
	System.out.println("Search for:");
	String query = read.nextLine();
	
	try(Scanner fileRead = new Scanner(Paths.get(fileName))) {
	    boolean found = false;
	    while(fileRead.hasNextLine()) {
		fileContent.add(fileRead.nextLine());
	    }
	    for(String line : fileContent) {
		if(line.contains(query)) {
		    found = true;
		    System.out.println("Found!");
		    break;
		}
	    }
	    if(!found) {
		System.out.println("Not found.");
	    }
	} catch(Exception e) {
	    System.out.println("Reading the file " + fileName + " failed.");
	}
    }
}



//import java.util.Scanner;
//import java.nio.file.Paths;
//
//public class IsItInTheFile {
//    public static void main(String[] args) {
//	Scanner read = new Scanner(System.in);
//	
//	System.out.println("Name of the file:");
//	String fileName = read.nextLine();
//	
//	System.out.println("Search for:");
//	String query = read.nextLine();
//	
//	try(Scanner fileReader = new Scanner(Paths.get(fileName))){
//	    boolean found = false;
//	    while(fileReader.hasNextLine()) {
//		if(fileReader.nextLine().equals(query)) {
//		    System.out.println("Found!");
//		    found = true;
//		    break;
//		}
//	    }
//	    if(!found){
//		System.out.println("Not Found.");
//	    }
//	} catch(Exception e) {
//	    System.out.println("Reading the file " + fileName + " failed.");
//	}
//    }
//}



//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class IsItInTheFile {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Name of the file:");
//        String file = scanner.nextLine();
//
//        System.out.println("Search for:");
//        String searchedFor = scanner.nextLine();
//
//        ArrayList<String> list = new ArrayList<>();
//        // implement reading the file here.
//
//        try ( Scanner reader = new Scanner(Paths.get(file))) {
//            while (reader.hasNextLine()) {
//                list.add(reader.nextLine());
//            }
//        } catch (Exception e) {
//            System.out.println("Reading the file " + file + " failed");
//        }
//
//        System.out.println("");
//
//        int count = 0;
//        for (String lines : list) {
//            if (lines.contains(searchedFor)) {
//                count++;
//            }
//        }
//        
//        if (count == 0) {
//            System.out.println("Not found.");
//        } else {
//            System.out.println("Found!");
//        }
//
//    }
//}
