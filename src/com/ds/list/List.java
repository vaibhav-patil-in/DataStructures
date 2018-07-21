package com.ds.list;

public interface List<T> {
	
	public void add(T element);
	
	public void addAll(List<T> list);
	
	public void remove(int index);
	
	public void remove(T element);
	
	public T get(int index);
	
	public boolean contains(T element);
	
	public int size();
	
	public boolean isEmpty();
}
