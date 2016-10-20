package com.sort.util;

public class Cat implements Comparable<Cat>{
	Comparator<Cat> comparator;
	int age;
	int weight;
	
	public Cat(Comparator<Cat> comparator, int age, int weight) {
		this.comparator = comparator;
		this.age = age;
		this.weight = weight;
	}
	@Override
	public int compareTo(Cat cat) {
		
		return comparator.comparator(this, cat);
	}
	public Comparator<Cat> getComparator() {
		return comparator;
	}
	public void setComparator(Comparator<Cat> comparator) {
		this.comparator = comparator;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "age:"+age+"weight:"+weight;
	}	
}
