package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int key;
		
		for (int j = 1; j <rightIndex; j++) {
			key = j;
			for (int i = j - 1;(i >= 0) && (array[i].compareTo(array[key]) == 1) ; i--) {
				util.Util.swap(array, i, j);
			}
		}
	}
}
