package golovachcourses.procedural.loops;

import java.util.Arrays;

/**
 * Bubblesort is the class for sorting arrays using bubble sort.
 * Includes four bubble sort types.
 *
 * @author Evgeny
 */
public class Bubblesort {

	private int[] data;
	
	/**
	 * Class constructor.
	 * 
	 * @param  data array you want to sort
	 */
	public Bubblesort(int[] data) {
		this.data = data;
	}

	/**
	 * Sorts array ascending using bubble sort. Max element moves to the right. 
	 */
	public void sortBubbleAscMoveMaxElement () {
		int length = this.data.length;
		for (int step = 0; step < length-1; step++) {
			for (int arrayIndex = 0; arrayIndex < length-1-step; arrayIndex++) {
				if (this.data[arrayIndex] > this.data[arrayIndex+1]) {
					this.swapTwoElements(arrayIndex, arrayIndex+1);
				}
			}
		}
	}
	
	/**
	 * Sorts array ascending using bubble sort. Min element moves to the left. 
	 */
	public void sortBubbleAscMoveMinElement () {
		int length = this.data.length;
		for (int step = 0; step < length-1; step++) {
			for (int arrayIndex = length; arrayIndex > 1 + step; arrayIndex--) {
				if (this.data[arrayIndex-1] < this.data[arrayIndex-2]) {
					this.swapTwoElements(arrayIndex-1, arrayIndex-2);
				}
			}
		}
	}
	
	/**
	 * Sorts array descending using bubble sort. Min element moves to the right. 
	 */
	public void sortBubbleDescMoveMinElement () {
		int length = this.data.length;
		for (int step = 0; step < length-1; step++) {
			for (int arrayIndex = 0; arrayIndex < length-1-step; arrayIndex++) {
				if (this.data[arrayIndex] < this.data[arrayIndex+1]) {
					this.swapTwoElements(arrayIndex, arrayIndex+1);
				}
			}
		}
	}

	/**
	 * Sorts array descending using bubble sort. Max element moves to the left. 
	 */
	public void sortBubbleDescMoveMaxElement () {
		int length = this.data.length;
		for (int step = 0; step < length-1; step++) {
			for (int arrayIndex = length; arrayIndex > 1 + step; arrayIndex--) {
				if (this.data[arrayIndex-1] > this.data[arrayIndex-2]) {
					this.swapTwoElements(arrayIndex-1, arrayIndex-2);
				}
			}
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
