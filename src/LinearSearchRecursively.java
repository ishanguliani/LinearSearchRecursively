import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of linear Search algorithm using recursion 
 * 
 * @author ishanguliani
 *
 * @id $id$
 * 
 * @revisions: 
 * 	initial version 01:15:00 AM 24th April 2018
 */

public class LinearSearchRecursively {
	
	static int NUMBER_NOT_FOUND = -1;
	static int NUMBER_TO_SEARCH = 2;
	
	public static void main(String[] args) {
		// dummy array list to store numbers
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(2);
		list.add(8);
		list.add(12);
		list.add(31);
		
		// output the stored data
		for(int item: list){
		System.out.println(item);
		}
				int positionFound = -1;
		
		if(!list.isEmpty())	{
			//invoking LinearSearch method 
			positionFound = LinearSearch(list, 0, list.size()-1, NUMBER_TO_SEARCH);
		}
		
		if(positionFound == NUMBER_NOT_FOUND)	{
			System.out.println("Number does not exist in the container");
		}else	{
			System.out.println("Number found at position : " + positionFound);		
		}
		
	}
	
	/**
	 * Returns the position of the item in the given container, else returns -1
	 * @param list: the container to search through
	 * @param low: the lower index of the search subset
	 * @param high: the upper index of the search subset
	 * @param number: the item to search
	 * @return
	 */
	static int LinearSearch(List<Integer> list,int low, int high, int number){
		if(high < low)
			return NUMBER_NOT_FOUND;
		if(number == list.get(low))	{
			//element found at this position
			return low;
		}
	
		//element still not found then continue recursively
		return LinearSearch(list, ++low, high, number);
		
	}
	
}
