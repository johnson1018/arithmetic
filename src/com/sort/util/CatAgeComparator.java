package com.sort.util;

public class CatAgeComparator implements Comparator<Cat> {

	@Override
	public int comparator(Cat o1, Cat o2) {
		return o1.getAge() > o2.getAge() ? 1 : o1.getAge() < o2.getAge() ? -1 : 0;
	}
}
