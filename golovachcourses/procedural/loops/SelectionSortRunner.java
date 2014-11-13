package golovachcourses.procedural.loops;

/**
 * BubbleSortRunner is the simple class which runs Bubblesort class methods'
 *
 * @author Evgeny
 */
public class SelectionSortRunner {

	public static void main(String[] args) {
		
		int[] testData = {40, 20, 50, 30, 10};

		SelectionSort selectionsortInstance = new SelectionSort(testData);
		selectionsortInstance.printToConsole("Initial Array");
		selectionsortInstance.sortSelection();
		selectionsortInstance.printToConsole("Result Array");
	}
}
