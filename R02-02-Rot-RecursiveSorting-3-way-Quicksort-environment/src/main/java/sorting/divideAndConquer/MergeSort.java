package sorting.divideAndConquer;

import sorting.AbstractSorting;

/**
 * Merge sort is based on the divide-and-conquer paradigm. The algorithm
 * consists of recursively dividing the unsorted list in the middle, sorting
 * each sublist, and then merging them into one single sorted list. Notice that
 * if the list has length == 1, it is already sorted.
 */
public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int firstIndex, int lastIndex) {
		
		if (firstIndex < lastIndex) {
			int middleIndex = ((firstIndex + lastIndex) / 2);
			sort(array, firstIndex,middleIndex);
			sort(array, middleIndex + 1, lastIndex);
			mergeSort(array, firstIndex, middleIndex, lastIndex);
		}
		
	}

	private void mergeSort(T[] array, int firstIndex, int middleIndex, int lastIndex) {
		T[] array_aux = (T[]) new Object[array.length];
		
		for (int i = firstIndex; i <= lastIndex; i++) {
			array_aux[i] = array[i];
		}
		
		int i = firstIndex;
		int j = middleIndex + 1;
		int k = firstIndex;
		
		while (i <= middleIndex && j <= lastIndex) {
			if (array_aux[i].compareTo(array_aux[j]) < 0 ) {
				array[k] = array_aux[i];
				//util.Util.swap(array, k, i);
				i++;
			} else {
				array[k] = array_aux[j];
				//util.Util.swap(array, k, j);
				j++;
			}
			k++;
		}
		
		while (i <= middleIndex) {
			array[k] = array_aux[i];
			//util.Util.swap(array, k, i);
			k+=1;
			i+=1;
		}
		
		while(j <= lastIndex) {
			array[k] = array_aux[j];
			//util.Util.swap(array, k, j);
			k+=1;
			j+=1;
		}
		
	}
}
