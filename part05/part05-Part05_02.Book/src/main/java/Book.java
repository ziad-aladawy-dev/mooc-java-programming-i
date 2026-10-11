public class Book {
    private String author;
    private String title;
    private int pageCount;
    
    public Book(String author, String title, int pageCount) {
	this.author = author;
	this.title = title;
	this.pageCount = pageCount;
    }
    
    // getters are for external access not for internal use within the class itself
    
    public String getAuthor() {
	return this.author;
    }
    
    public String getName() {
	return this.title;
    }
    
    public int getPages() {
	return this.pageCount;
    }
    
    @Override
    public String toString() {
	return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }
}


//public class Book {
//    private String author;
//    private String name;
//    private int pages;
//    
//    public Book(String author, String name, int pages) {
//        this.author = author;
//        this.name = name;
//        this.pages = pages;
//    }
//    
//    public String getAuthor() {
//        return this.author;
//    }
//    
//    public String getName() {
//        return this.name;
//    }
//    
//    public int getPages() {
//        return this.pages;
//    }
//    
//    public String toString() {
//        return "" + this.author + ", " + this.name + ", " + this.pages + " pages";
//    }
//    
//}
