import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	ArrayList<Item> items = new ArrayList<>();
	while(true) {
	    String id = prompt(read, "Identifier? (empty will stop)");
	    if(id.equals("")){
		break;
	    }
	    String name = prompt(read, "Name? (empty will stop)");
	    if(id.equals("")){
		break;
	    }
	    
	    Item item = new Item(id, name);
	    
	    if(!(items.contains(item))){
		items.add(item);
	    }
	}
	// B07H8ND8HH: He-Man figure
	for(Item item: items) {
	    System.out.println(item.getId() + ": " + item.getName());
	}
    }
    
    public static String prompt(Scanner read, String q) {
	System.out.println(q);
	return read.nextLine();
    }
}