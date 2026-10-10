
public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
	if(this.value > 0){
	    this.value--;
	}else{
	    System.out.println("Minimum value reached.");
	}
    }
    public void reset(){
	this.value = 0;
    }

    // and the other methods go here
}









//public class DecreasingCounter {
//
//    private int value;  // an object variable for storing the value of the counter
//
//    public DecreasingCounter(int initialValue) {
//        this.value = initialValue;
//    }
//
//    public void printValue() {
//        // Do not change this code!
//        System.out.println("value: " + this.value);
//    }
//
//    public void decrement() {
//        // write the method implementation here
//        // the aim is to decrement the value of the counter by one
//        if (this.value > 0) {
//            this.value = this.value - 1;
//        }
//    }
//
//    // the other methods go here
//    public void reset() {
//        this.value = 0;
//    }
//}
