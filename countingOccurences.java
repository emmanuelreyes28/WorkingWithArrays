
public class countingOccurences {
	public static void main (String[] args) {
		//Testing countOccurences
		int[] num = {10, 10, 5, 6, 10, 4};
		System.out.println(countOccurences(num,10)); //3
		
		int[] num2 = {0,1,2,3};
		System.out.println(countOccurences(num2,0)); //1
		
		int[] num3 = {10, 25, 36, 8};
		System.out.println(countOccurences(num3,4)); //0
		
		int[] num4 = {};
		System.out.println(countOccurences(num4,1)); //0
		
		int[] num5 = {12, 65, 48, 78, 48, 50, 48, 100, 48, 48}; //5
		System.out.println(countOccurences(num5,48));

	}
	/**
	 * The method takes in an int array and an int and returns the number
	 * of times that the second parameter (int) is found in the array.
	 * @param v array of integers.
	 * @param k is the integer that is being searched in array v.
	 * @return the number of occurrences of k that is found in array v.
	 */
	
	public static int countOccurences(final int[]v, int k) {
		//local variables 
		int counter = 0;
		int occurences = 0;
		
		//keeps count of how many times k is encountered in array v
		while(counter < v.length) {
			if(v[counter] == k) {
				counter++;
				occurences += 1;
			} else {
				counter++;
			}
		} return occurences;
	}

}
