package SortingArrayListOption1;

/*
 * 
 * Description: This class contains a generic selection sort method that works for any ArrayList 
 *              of objects. The sorting order is determined by a Comparator provided to the method. 
 *              The selection sort algorithm finds the smallest/largest element in the unsorted part 
 *              and swaps it with the first unsorted element in each iteration.
 */

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

    // Generic selection sort method that works for any ArrayList of objects with a comparator
    public static <T> void selectionSort(ArrayList<T> list, Comparator<? super T> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}
