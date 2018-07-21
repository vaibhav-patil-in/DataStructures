package com.ds.list;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {

	private Object[] data;
	private int size;
	
	public ArrayList() {
		this.size = 0;
		this.data = new Object[0];
	}
	
	@Override
	public void add(T element) {
		
		//Check capacity or increase array
		ensureCapacity(size+1);
		
		data[size++] = element;
	}

	@Override
	public void addAll(List<T> list) {

	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) data[index];
	}

	@Override
	public boolean contains(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return this.data.length;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0 ? true : false;
	}
	
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = this.size();
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
		List<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.println("Size : "+arrayList.size());
		arrayList.add(10);
		System.out.println("Size : "+arrayList.size());
		arrayList.add(30);
		System.out.println("Size : "+arrayList.size());
		arrayList.add(45);
		System.out.println("Size : "+arrayList.size());
		arrayList.add(3);
		System.out.println("Size : "+arrayList.size());
		arrayList.add(7);
		System.out.println("Size : "+arrayList.size());
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
