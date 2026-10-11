/*
java.util.Scanner
java.nio.file.Paths
java.util.ArrayList
java.lang.Math -- automatically imported in every java program, the compiler already knows
*/

public class Cube {
    private int edgeLength;
    
    public Cube(int edgeLength) {
	this.edgeLength = edgeLength;
    }
    
    public int volume() {
	return (int) Math.pow(this.edgeLength, 3);
    }
    
    public String toString() {
	return "The length of the edge is " + this.edgeLength + "and the volume" +  volume();
    }
}