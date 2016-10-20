package com.sort;

import com.sort.util.Comparable;

public class InsertionSort implements Sort {

	@Override
	public void sort(Comparable[] arrs) {
		if (arrs != null) {
			insertionSort(arrs);
		}
	}
	
    static void insertionSort(Comparable[] unsorted)
    {
        for (int i = 1; i < unsorted.length; i++)
        {
            if (unsorted[i - 1].compareTo(unsorted[i]) > 0)
            {
            	Comparable temp = unsorted[i];
                int j = i;
                while (j > 0 && unsorted[j - 1].compareTo(temp) > 0)
                {
                    unsorted[j] = unsorted[j - 1];
                    j--;
                }
                unsorted[j] = temp;
            }
        }
    }

}
