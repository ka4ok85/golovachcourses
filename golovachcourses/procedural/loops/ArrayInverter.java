package golovachcourses.procedural.loops;

import java.util.Arrays;

/**
 * ArrayInverter is the class for inverting elements in array.
 * Includes two identical algorithms.
 *
 * @author Evgeny
 */
public class ArrayInverter {
	private int[] data;
	
	/**
	 * Class constructor.
	 * 
	 * @param  data array you want to sort
	 */
	public ArrayInverter(int[] data) {
		this.data = data;
	}

	/**
	 * Inverts array elements starting from the first and last elements 
	 */
	public void invertElementsStartFromBorders () {
		int length = this.data.length;
		for (int arrayIndex = 0; arrayIndex < length/2; arrayIndex++) {
			this.swapTwoElements(arrayIndex, length-1-arrayIndex);
		}
	}

	/**
	 * Inverts array elements starting from the array's middle element(s) 
	 */
	public void invertElementsStartFromMiddle () {
		int length = this.data.length;
		for (int arrayIndex = length/2-1; arrayIndex >= 0; arrayIndex--) {
			this.swapTwoElements(arrayIndex, length-1-arrayIndex);
		}
	}

	/**
	 * Outputs array to the console
	 * 
	 * @param Message Prefix message that will be printed before actual data
	 */
	public void printToConsole(String Message) {
		System.out.println(Message + ": " + Arrays.toString(this.data));
	}
	
	/**
	 * Swaps two elements in array using their indexes
	 * 
	 * @param firstIndex  first element's index
	 * @param secondIndex second element's index
	 */
	private void swapTwoElements(int firstIndex, int secondIndex) {
		int temporary = this.data[firstIndex];
		this.data[firstIndex] = this.data[secondIndex];
		this.data[secondIndex] = temporary;
	}
}
