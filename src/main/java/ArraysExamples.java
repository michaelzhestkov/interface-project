/**
 * File Name: arrays.java<br>
 *
 * Zhestkov, Michael<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 31, 2016
 *
 */

public class ArraysExamples {

	private static int x;

	public static void Arrays() {
		char[] charArray1 = { 'a', 'b', 'c', 'd', 'e' };

		char[] charArray2;
		charArray2 = new char[5];

		char[] charArray3 = new char[5];

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };

		int arrayLenghtForInt = intArray.length;
		System.out.println("Array lenght is " + arrayLenghtForInt);

		String[] stringArray = { "one", "two", "three", "four", "five" };
		for (x = 0; x < stringArray.length; x++) {
			System.out.println(stringArray[x]);
		}

	}

}