package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * The implementation of the algorithm must be in-place!
 */
public class GnomeSort<T extends Comparable<T>> extends AbstractSorting<T> {
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int pivot = 0;
		while (pivot < array.length - 1) {
			if (array[pivot].compareTo(array[pivot + 1]) < 0) {
				pivot ++;
			} else if (array[pivot].compareTo(array[pivot + 1]) > 0) {
				Util.swap(array, pivot, pivot + 1);
				if (pivot > 0) pivot --;
			} else if (array[pivot].compareTo(array[pivot + 1]) == 0) pivot ++;
		}
	} 
}
