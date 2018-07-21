package com.ds.array;

import java.util.Arrays;

public class DynamicArray<T> {

	Object[] data;
	int size;
	
	public DynamicArray() {
		this.size = 0;
		this.data = new Object[0];
	}
	
	public int getSize() {
		return this.data.length;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) data[index];
	}
	
	public void add(T element) {
		
		//Ensure capacity and increase if cannot accomodate new elements
		ensureCapacity(size+1);
		data[size++] = element;
		
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
			data = Arrays.copyOf(data, newCapacity);
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
