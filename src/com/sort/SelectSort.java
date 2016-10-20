package com.sort;

import com.sort.util.Comparable;

public class SelectSort implements Sort {

	@Override
	public void sort(Comparable[] arrs) {
		selectSort(arrs);
	}
	
	static void selectSort(Comparable[] unsorted)
    {
        for (int i = 0; i < unsorted.length; i++)
        {
        	Comparable min = unsorted[i];
        	int min_index = i;
            for (int j = i; j < unsorted.length; j++)
            {
                if (unsorted[j].compareTo(min) < 0 )
                {
                    min = unsorted[j];
                    min_index = j;
                }
            }
            if (min_index != i)
            {
            	Comparable temp = unsorted[i];
                unsorted[i] = unsorted[min_index];
                unsorted[min_index] = temp;
            }
        }
    }

}
