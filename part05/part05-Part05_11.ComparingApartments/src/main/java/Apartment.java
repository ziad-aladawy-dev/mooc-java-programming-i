
public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getSquares() {
	return squares;
    }

    public int getPricePerSquare() {
	return pricePerSquare;
    }
    
    public int price() {
	return this.squares * this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
	if(this.squares > compared.getSquares()){
	    return true;
	}
	return false;
    }
    
    public int priceDifference(Apartment compared) {
	int diff = this.price() - compared.price();
	return (diff < 0)? -diff : diff;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
	int home = this.price();
	int away = compared.price();
	if(home > away) {
	    return true;
	}
	return false;
    }
}

//public class Apartment {
//
//    private int rooms;
//    private int squares;
//    private int princePerSquare;
//
//    public Apartment(int rooms, int squares, int pricePerSquare) {
//        this.rooms = rooms;
//        this.squares = squares;
//        this.princePerSquare = pricePerSquare;
//    }
//          
//    public boolean largerThan(Apartment compared) {
//        return this.squares > compared.squares;
//    }
//    
//    public int price() {
//        return this.squares * this.princePerSquare;
//    }
//    
//    public int priceDifference(Apartment compared) {
//        return Math.abs(this.price() - compared.price());
//    }
//    
//    public boolean moreExpensiveThan(Apartment compared) {
//        return this.price() > compared.price();
//    }
//
//}
