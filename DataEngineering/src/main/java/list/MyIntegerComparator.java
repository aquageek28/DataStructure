package list;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		/*
		 * Compares its two arguments for order.  Returns a negative integer,
	     * zero, or a positive integer as the first argument is less than, equal
	     * to, or greater than the second.
		 */

		
		if(o1 < o2) {
			return -1;
		} else if (o1 == o2) {
			return 0;
		} else {
			return +1;
		}
	}
}
