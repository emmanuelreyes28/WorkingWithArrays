import java.util.Arrays;

public class identicalArrays {
	public static void main (String [] arggs) {
		//Test areIdentical method
		int [] array1 = {10, 20, 30, 40};
		int [] array2 = {10, 20, 30, 40};
		System.out.println(areIdentical(array1, array2)); //true
		
		int [] a3 = {1, 2, 4, 5};
		int [] a4 = {1, 2, 5, 4};
		System.out.println(areIdentical(a3,a4)); //false
		
		int [] a5 = {5, 7, 9, 2, 1};
		int [] a6 = {11, 40, 78, 9, 5};
		System.out.println(areIdentical(a5,a6)); //false
		
		int [] a7 = {};
		int [] a8 = {};
		System.out.println(areIdentical(a7,a8)); //true
		
		System.out.println(areIdentical(a3,a7)); //false

	}
	/**
	 * The method checks if array a and b are identical.
	 * @param a first array of ints 
	 * @param b second array of ints
	 * @return True if a and b are identical otherwise it returns false.
	 */
	//method checks if array a and b are identical. Returns boolean
	public static boolean areIdentical(final int[]a, final int[]b) {
		if (Arrays.equals(a, b)) {
			return true;
		} else {
			return false;
		}
	}

}
