package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex + 1; i < rightIndex; i++) {
			for (int j = 0; j < rightIndex - 1; j++) {
				if (array[j].compareTo(array[j + 1]) == 1) {
					util.Util.swap(array, leftIndex, rightIndex);
				}
			}
		}
	}	
}
