public class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
	this.name = name;
	this.age = age;
    }
    
    @Override
    public String toString(){
	return "This animal is " + this.name + " and it's " + this.age + " years old";
    }
}