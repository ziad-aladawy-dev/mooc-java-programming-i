public class Statistics {
    private int count;
    private int numberSum;
    
    public Statistics() {
        // initialize the variable numberCount here
	this.count = 0;
	this.numberSum = 0;
    }

    public void addNumber(int number) {
        // write code here
	this.count++;
	this.numberSum += number;
    }

    public int getCount() {
        // write code here
	return this.count;
    } 
    
    public int sum() {
	return this.numberSum;
    }
    
    public double average() {
	if(this.count == 0) return 0;
	return 1.0 * this.numberSum / this.count;
    }
}