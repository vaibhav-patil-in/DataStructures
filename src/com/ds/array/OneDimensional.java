package com.ds.array;

public class OneDimensional {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		numbers[0] = 20;
		numbers[1] = 2;
		numbers[2] = 23;
		numbers[3] = 7;
		numbers[4] = 8;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		Student[] students = new Student[2];
		students[0] = new Student("John", 30);
		students[1] = new Student("Lisa", 26);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + " " + students[i].age);
		}
	}
	
	public static class Student {
		String name;
		int age;
		
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
	}
}


