import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	// title, pages, publication year
	ArrayList<Book> books = new ArrayList<>();
	
	while(true) {
	    System.out.println("Title: ");
	    String bookName = read.nextLine();
	    if(bookName.equals("")) {
		System.out.println("");
		break;
	    }
	    System.out.println("Pages: ");
	    int bookPages = Integer.valueOf(read.nextLine());
	    System.out.println("Publication year: ");
	    int bookPublicationYear = Integer.valueOf(read.nextLine());
	    books.add(new Book(bookName, bookPages, bookPublicationYear));
	}
	System.out.println("What information will be printed?");
	String ans = read.nextLine();
	if(ans.equals("everything")) {
	    books.forEach(book -> {
		System.out.println(book);
	    });
	}else if(ans.equals("name")) {
	    books.forEach(book -> {
		System.out.println(book.getTitle());
	    });
	}else if (ans.equals("pages")) {
	    books.forEach(book -> {
		System.out.println(book.getPages());
	    });
	}else if (ans.equals("year")) {
	    books.forEach(book -> {
		System.out.println(book.getYear());
	    });
	}else{
	    System.out.println("Invalid Input");
	}
    }
}