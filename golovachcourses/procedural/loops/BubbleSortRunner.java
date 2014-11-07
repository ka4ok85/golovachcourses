package golovachcourses.procedural.loops;

/**
 * BubbleSortRunner is the simple class which runs Bubblesort class methods'
 *
 * @author Evgeny
 */
public class BubbleSortRunner {

	public static void main(String[] args) {
		
		int[] testData = {40, 20, 50, 30, 10};

		Bubblesort bubblesortInstance = new Bubblesort(testData);
		bubblesortInstance.printToConsole("Initial Array");
		bubblesortInstance.sortBubbleAscMoveMaxElement();
		//bubblesortInstance.sortBubbleAscMoveMinElement();
		//bubblesortInstance.sortBubbleDescMoveMinElement();
		//bubblesortInstance.sortBubbleDescMoveMaxElement();
		bubblesortInstance.printToConsole("Result Array");
	}
}
