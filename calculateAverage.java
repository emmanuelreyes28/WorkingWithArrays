
public class calculateAverage {
	public static void main (String[] args) {
		//Test myAverage method 
		int test1 [] = {10,10,10};
		System.out.println(myAverage(test1));
		
		int test2 [] = {0,12,2};
		System.out.println(myAverage(test2));
		
		int test3 [] = {15,14,20,100};
		System.out.println(myAverage(test3));
		
		int test4 [] = {4,9,21,11};
		System.out.println(myAverage(test4));
		
		int test5 [] = {};
		System.out.println(myAverage(test5));
	}
	/**
	 * The method takes in an array of ints and returns the average.
	 * @param v array of ints.
	 * @return double average of array v.
	 */
	
	//method returns average of array v 
	public static double myAverage(final int[]v) {
		//local variables 
		double sum = 0;
		double average = 0;
		
		//gets the sum of array 
		for(double element: v) {
			sum += element;
		}
		
		//returns average of array 
		if(v.length > 0) {
			average += sum/v.length;
			return average;
		} else {
			return 0.0;
		}
		
	}

}
