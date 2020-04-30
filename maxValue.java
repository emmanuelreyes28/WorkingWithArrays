
public class maxValue {
	public static void main(String[] args) {
		//Test myMaximum method
		
		int n1 [] = {10, 50, 59}; 
		System.out.println(myMaximum(n1)); //59
		
		int n2 [] = {}; 
		System.out.println(myMaximum(n2)); //Integer.MIN_VALUE
		
		int n3 [] = {-4, 0, 3, 9, 75};
		System.out.println(myMaximum(n3)); //75
		
		int n4 [] = {-2, -6, -9, -11};
		System.out.println(myMaximum(n4)); //-2
		
		int n5 [] = {500, 501, 499, -504}; //501
		System.out.println(myMaximum(n5));

	}
	
	/**
	 * The method takes in an int array and returns largest int the array 
	 * @param a is an array of ints 
	 * @return largest int in a
	 */
	
	//method returns the largest int in the array
	public static int myMaximum(final int[]a) {
		//check array length 
		if(a.length == 0) {
			return Integer.MIN_VALUE;
		}
		//local variable that will be updated 
		int largest = a[0];
		
		//traverses through the array and returns largest int 
		for(int i = 1; i < a.length; i++) {
			if(a[i] > largest) {
				largest = a[i];
			}
		} return largest;
	}

}
