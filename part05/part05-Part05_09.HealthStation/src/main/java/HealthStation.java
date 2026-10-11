
public class HealthStation {
    private int cnt;
    
    public HealthStation() {
	this.cnt = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
	if(person != null){
	    this.cnt++;
	    return person.getWeight();
	}
        return -1;
    }
    
    public void feed(Person person) {
	if(person != null) {
	    person.setWeight(person.getWeight() + 1);
	}
    }
    
    public int weighings() {
	return this.cnt;
    }

}












//public class HealthStation {
//    
//    private int counter;
//    
//    public int weigh(Person person) {
//        // return the weight of the person passed as the parameter
//        this.counter++;
//        return person.getWeight();
//        }
//    
//    public void feed(Person person) {
//        person.setWeight(person.getWeight() + 1);
//    }
//    
//    public int weighings() {
//        return this.counter;
//    }
//
//}
