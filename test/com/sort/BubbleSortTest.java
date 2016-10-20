package com.sort;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sort.util.Cat;
import com.sort.util.CatAgeComparator;

public class BubbleSortTest {

	@Test
	public void test() {
		Cat[] cats = {new Cat(new CatAgeComparator(),12,30),
				  new Cat(new CatAgeComparator(),16,39),
				  new Cat(new CatAgeComparator(),19,36),
				  new Cat(new CatAgeComparator(),13,38),
				  new Cat(new CatAgeComparator(),15,34),
				  new Cat(new CatAgeComparator(),10,33)
		};
	
		new BubbleSort().sort(cats);
	
		for(Cat cat: cats){
			System.out.println(cat);
		}
	}

}
