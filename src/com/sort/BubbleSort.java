package com.sort;

import java.util.ArrayList;
import java.util.List;

import com.sort.util.Comparable;

public class BubbleSort implements Sort {
	@Override
	public void sort(Comparable[] arrs) {
		if (arrs != null) {
			bubbleSort(arrs);
		}
	}

	void bubbleSort(Comparable n[]) {
		for(int i=n.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				Comparable o1 = (Comparable)n[j];
				Comparable o2 = (Comparable)n[j+1];
				if(o1.compareTo(o2) == 1) {
					swap(n, j , j+1);
				}
			}
		}
    }
	
	private void swap(Object[] a, int x, int y) {
		Object temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
 
}
