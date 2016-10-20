package com.sort;

import com.sort.util.Comparable;

public class QuickSort implements Sort {

	@Override
	public void sort(Comparable[] arrs) {
		quickSort(arrs,0,arrs.length-1);
	}

	public void quickSort(Comparable[] arrs,int low,int high){
		if(low == high) return;
		int l=low;
		int h=high;		
		
		if(low >= high) return;
		
		Comparable povit = arrs[low];
		while(l < h){
			while(l < h && arrs[h].compareTo(povit) > 0){
				h--;
			}
			if(l<h)
				arrs[l++]=arrs[h];
			while(l<h && arrs[l].compareTo(povit) < 0){
				l++;
			}
			if(l<h)
				arrs[h--] = arrs[l];
		}
		arrs[l] = povit;
		
		quickSort(arrs,low,l-1);
		quickSort(arrs,l+1,high);
	}

}
