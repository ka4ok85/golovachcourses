package golovachcourses.procedural.loops;

import java.util.Arrays;

/**
 * ArrayMerger is the class for merging two arrays and then sort result.
 *
 * @author Evgeny
 */
public class ArrayMerger {

	private int[] firstArray;
	private int[] secondArray;
	
	/**
	 * Class constructor.
	 * 
	 * @param  firstArray  first array you want to merge
	 * @param  secondArray second you want to merge
	 */
	public ArrayMerger(int[] firstArray, int[] secondArray) {
		this.firstArray = firstArray;
		this.secondArray = secondArray;
	}

	/**
	 * Merges two sorted arrays and sorts result ascending 
	 * 
	 * @return int[]
	 */
	public int[] mergeAndSort () {
		int firstArrayLength = this.firstArray.length; 
		int secondArrayLength = this.secondArray.length;
		int resultLength = firstArrayLength + secondArrayLength;
		int[] result = new int[resultLength];
		int firstArrayIndex = 0;
		int secondArrayIndex = 0;
		for (int arrayIndex = 0; arrayIndex < resultLength; arrayIndex++) {
			if (firstArrayIndex > firstArrayLength-1) {
				result[arrayIndex] = this.secondArray[secondArrayIndex];
				secondArrayIndex++;
			} else if (secondArrayIndex > secondArrayLength-1) {
				result[arrayIndex] = this.firstArray[firstArrayIndex];
				firstArrayIndex++;
			} else {
				if (this.firstArray[firstArrayIndex] > this.secondArray[secondArrayIndex]) {
					result[arrayIndex] = this.secondArray[secondArrayIndex];
					secondArrayIndex++;
				} else {
					result[arrayIndex] = this.firstArray[firstArrayIndex];
					firstArrayIndex++;
				}
			}
		}
		
		return result;
	}

	/**
	 * Outputs array to the console
	 * 
	 * @param Message 		 Prefix message that will be printed before array
	 * @param arrayToDisplay Array that will be output
	 */
	public void printArrayToConsole(String Message, int[] arrayToDisplay) {
		System.out.println(Message + ": " + Arrays.toString(arrayToDisplay));
	}

}
