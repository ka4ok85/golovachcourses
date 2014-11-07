package golovachcourses.procedural.loops;

/**
 * ArrayMergerRunner is the simple class which runs ArrayMerger class method for merging and ascending sorting two arrays
 *
 * @author Evgeny
 */
public class ArrayMergerRunner {

	public static void main(String[] args) {
		int[] firstArray = {1, 3, 5, 7};
		int[] secondArray = {2, 4, 6, 8};
		int[] result;

		ArrayMerger arrayMergerInstance = new ArrayMerger(firstArray, secondArray);
		arrayMergerInstance.printArrayToConsole("First Array", firstArray);
		arrayMergerInstance.printArrayToConsole("Second Array", secondArray);
		result = arrayMergerInstance.mergeAndSort();

		arrayMergerInstance.printArrayToConsole("Result Array", result);

	}

}
