package golovachcourses.procedural.loops;

import java.util.Arrays;

/**
 * SelectionSort is the class for sorting arrays using selection sort.
 *
 * @author Evgeny
 */
public class SelectionSort {

	private int[] data;
	
	/**
	 * Class constructor.
	 * 
	 * @param  data array you want to sort
	 */
	public SelectionSort(int[] data) {
		this.data = data;
	}

	/**
	 * Sorts array ascending using selection sort 
	 */
	public void sortSelection () {
		int length = this.data.length;

		for (int indexElement = 0; indexElement < length-1; indexElement++) {
			int outerLoopElement = this.data[indexElement];
			int min = outerLoopElement;
			int indexToRemember = indexElement;
			// finding min element in a row
			for (int elementToCompareIndex = indexElement+1; elementToCompareIndex < length; elementToCompareIndex++) {
				int innerLoopElement = this.data[elementToCompareIndex];
				if (min > innerLoopElement) {
					min = innerLoopElement;
					indexToRemember = elementToCompareIndex;
				}
			}
			
			// making actual swap in row only once
			if (min != outerLoopElement) {
				this.swapTwoElements(indexElement, indexToRemember);
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