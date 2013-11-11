package edu.nyu.cs.Chapter3StacksAndQueues;

public class Hanoi4 {
	static final int totalStack = 3;
	int plate;
	public Hanoi4(int plate){
		this.plate = plate;
	}
	
	public void play(){
		moveRecursive(plate, 0, 2);
	}
	
	/**
	 * s indicates from which stack
	 * e indicates the target stack 
	 * @param plate
	 * @param s
	 * @param e
	 */
	public void moveRecursive(int plate, int s, int e){
		if (plate == 1) {
			System.out.println("put plate " + plate + " from stack " + s + " to " + e);
			return;
		} else {
			moveRecursive(plate - 1, s, totalStack - s - e);
			System.out.println("put plate " + plate + " from stack " + s + " to " + e);
			moveRecursive(plate - 1, totalStack - s -e, e);
		}
	}
}
