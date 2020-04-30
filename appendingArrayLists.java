import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class appendingArrayLists {
	public static void main (String [] args) {
		//Test appendArrayList method 
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
		appendArrayList(list1,list2);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(10));
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1,15,16));
		appendArrayList(list3,list4);
		
		ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList());
		ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(4));
		appendArrayList(list5,list6);
		
		ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(12,13,14,15));
		ArrayList<Integer> list8 = new ArrayList<Integer>(Arrays.asList());
		appendArrayList(list7,list8);
		
		ArrayList<Integer> list9 = new ArrayList<Integer>(Arrays.asList(20,19,18,17));
		ArrayList<Integer> list10 = new ArrayList<Integer>(Arrays.asList(16,15,14,13));
		appendArrayList(list9,list10);
		
		
	}
	/**
	 * The method takes in two ArrayList<Integer> and it appends the ints from 
	 * the second ArrayList to the first ArrayList. Then prints the new updated 
	 * first ArrayList 
	 * @param v first ArrayList that will be modified 
	 * @param w second ArrayList elements will be appended to v
	 */
	//method appends ArrayList w to ArrayList v
	public static void appendArrayList(ArrayList<Integer>v, final ArrayList<Integer>w) {
		//enhanced for loop adds ints from arraylist w to arraylist v
		for(int num: w) {
			v.add(num);
		}
		
		System.out.println("v = " + v);
		
	}

}
