
public class orderedArrays {
	public static void main (String [] args) {
		//Test isStrictlyincreasing method
		int []a1 = {1, 2, 3, 4, 5};
		System.out.println(isStrictlyIncreasing(a1)); //true
		
		int []a2 = {5, 4, 3, 2, 1};
		System.out.println(isStrictlyIncreasing(a2)); //false
		
		int []a3 = {0};
		System.out.println(isStrictlyIncreasing(a3)); //false
		
		int []a4 = {3, 6, 9, 12, 15};
		System.out.println(isStrictlyIncreasing(a4)); //true
		
		int []a5 = {50,60,70,80,90,100};
		System.out.println(isStrictlyIncreasing(a5));//true
		
		//Do i have to test an empty array?
		
	}
	/**
	 * The method checks if array v is in increasing order and returns boolean.
	 * @param v array of ints.
	 * @return True if array v is in increasing order otherwise it returns false.
	 */
	
	//method checks if array is in increasing order and return boolean 
	public static boolean isStrictlyIncreasing(final int[]v) {
		//local variable that updates 
		int check = v[0];
		
		if(v.length < 1) {
			return false;
		}
		
		//traverses through array and checks if numbers are increasing 
		for(int i = 1; i < v.length; i++) {
			if(check < v[i]) {
				check = v[i];
				return true;
		} 
	
	
	}
		return false;

}}
