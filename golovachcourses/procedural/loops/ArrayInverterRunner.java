package golovachcourses.procedural.loops;

/**
 * ArrayInverterRunner is the simple class which runs ArrayInverter class methods'
 *
 * @author Evgeny
 */
public class ArrayInverterRunner {

	public static void main(String[] args) {
		int[] testData = {10, 20, 30, 40, 50};

		ArrayInverter arrayInverterInstance = new ArrayInverter(testData);
		arrayInverterInstance.printToConsole("Initial Array");
		arrayInverterInstance.invertElementsStartFromBorders();
		//arrayInverterInstance.invertElementsStartFromMiddle();
		arrayInverterInstance.printToConsole("Result Array");
	}

}