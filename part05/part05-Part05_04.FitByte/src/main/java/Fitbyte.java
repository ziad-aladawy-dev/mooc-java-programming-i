public class Fitbyte {
    private int restingHeartRate;
    private int age;
    
    // I'm trying to get the target heart rate...
    public Fitbyte(int age, int restingHeartRate) {
	this.age = age;
	this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
	// (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart
	double maxHeartRate = 206.3 - (0.711 * age);
	return (maxHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
    }
    
}