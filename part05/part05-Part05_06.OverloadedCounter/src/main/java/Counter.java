public class Counter {
    private int value;
    
    public Counter(int value) {
	this.value = value;
    }
    public Counter() {
	this(0);
    }
    
    public int value() {
	return this.value;
    }
    
    public void increase() {
	increase(1);
    }
    public void increase(int incValue) {
	if(incValue < 0){
	    return;
	}
	this.value += incValue;
    }
    
    public void decrease() {
	decrease(1);
    }
    public void decrease(int decValue) {
	if(decValue < 0){
	    return;
	}
	this.value -= decValue;
    }
}