package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * The combsort algoritm.
 */
public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int gap = array.length;
	    boolean swapped = true;
	    while (gap > 1 || swapped) {
	        if (gap > 1)
	            gap = (int) (gap / 1.25);

	        int i = 0;
	        swapped = false;
	        while (i + gap < array.length) {
	            if (array[i].compareTo(array[i + gap]) > 0) {
	                Util.swap(array, i, i + gap);
	                swapped = true;
	            }
	            i++;
	        }
	    }
		
	}
}
