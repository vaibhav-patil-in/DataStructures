package com.ds.array;

import java.util.Arrays;

public class DynamicArray<E> {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 0;
	
	public DynamicArray() {
		this.elements = new Object[DEFAULT_CAPACITY];
	}
	
	public int getSize() {
		return this.elements.length;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E) elements[index];
	}
	
	public void add(E element) {
		
		//Ensure capacity and increase if cannot accommodate new elements
		ensureCapacity(size+1);

		//Add element
		elements[size++] = element;
		
	}

	private void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if(minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			
			//In case of delete this can happen
			if(newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			
			//Copy element from First array in new array of double size
			elements = Arrays.copyOf(elements, newCapacity);
		}
	}
	
	public static void main(String[] args) {

		DynamicArray<Integer> da = new DynamicArray<Integer>();
		
		System.out.println("Size : "+da.getSize());
		da.add(10);
		System.out.println("Size : "+da.getSize());
		da.add(30);
		System.out.println("Size : "+da.getSize());
		da.add(45);
		System.out.println("Size : "+da.getSize());
		da.add(3);
		System.out.println("Size : "+da.getSize());
		da.add(7);
		System.out.println("Size : "+da.getSize());
		
		for (int i = 0; i < da.getSize(); i++) {
			System.out.println(da.get(i));
		}
	}
}
