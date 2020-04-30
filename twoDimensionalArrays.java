
public class twoDimensionalArrays {
	public static void main(String[] args) {
		//Test isAllZeros method 
		int[][] counts = {
				{0,1,0},
				{0,0,0},
				{1,1,1},
				{0,1,0}
		};
		System.out.println(isAllZeros(counts)); //false
		
		int[][] counts2 = {
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
				{0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0}
			
		};
		System.out.println(isAllZeros(counts2)); //false
		
		int[][] counts3= new int [10][20];
		System.out.println(isAllZeros(counts3)); //true
		
		int[][] counts4 = {
				{},
				{},
				{},
				{},
				{}
		};
		System.out.println(isAllZeros(counts4)); //true
	}
	/**
	 * The method checks if a 2D array contains all zeros and returns a boolean
	 * @param a two dimensional array 
	 * @return true if a contains all zeros otherwise returns false 
	 */
	
	public static boolean isAllZeros(final int[][]a) {
		boolean check = true;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if (a[i][j] != 0) {
					check = false;
				}
			}
		}
		return check;
	}

}
