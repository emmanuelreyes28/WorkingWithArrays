
public class reverseArray {
	public static void main (String[] args) {
		//Test reverseArray method 
		
		int [] a1 = {1, 2, 3, 4};
		reverseArray(a1);
		System.out.println();
		
		int [] a2 = {10,9,8,7};
		reverseArray(a2);
		System.out.println();

		int [] a3 = {21,54,63,98};
		reverseArray(a3);
		System.out.println();

		int [] a4 = {14,52,65,84};
		reverseArray(a4);
		System.out.println();

		int [] a5 = {45,69,25,30};
		reverseArray(a5);
		
	}
	/**
	 * The method takes in an array of ints and prints its elements in reverse. 
	 * @param v array of ints.
	 */
	
	//method reverses order of array 
	public static void reverseArray(int[]v) {
		for(int i = 0; i < v.length / 2; i++) {
			int temp = v[i];
			v[i] = v[v.length - i - 1];
			v[v.length - i -1] = temp;
		} 
		
		for(int num: v) {
			System.out.print(num + " ");
		}

}}
