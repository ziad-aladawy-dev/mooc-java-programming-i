public class Timer {
    private ClockHand hundredth;
    private ClockHand seconds;
    
    // Constructor
    public Timer() {
	this.hundredth  = new ClockHand(100);
	this.seconds = new ClockHand(60);
    }
    
    public void advance() {
	this.hundredth.advance();
	if(this.hundredth.value() == 0) {
	    this.seconds.advance();
	}
    }
    
    public String toString() {
	return this.seconds + ":" + this.hundredth;
    }
}















//public class Timer {
//    private ClockHand seconds;
//    private ClockHand hundredths;
//    
//    public Timer() {
//        this.seconds = new ClockHand(60);
//        this. hundredths = new ClockHand(100);
//    }
//    
//    public void advance() {
//        this.hundredths.advance();
//        if (this.hundredths.value() == 0) {
//            this.seconds.advance();
//        }
//    }
//    
//    public String toString() {
//        return "" + this.seconds.toString() + ":" + this.hundredths.toString();
//    }
//}
