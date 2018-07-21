package com.ds.array;

public class TwoDimensional {

	public static void main(String[] args) {
		int[][] data = new int[3][3];
		
		char[][] table = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
		
		data[0][0] = 20;
		data[0][1] = 3;
		data[0][2] = 2;
		
		data[1][0] = 45;
		data[1][1] = 34;
		data[1][2] = 23;
		
		data[2][0] = 50;
		data[2][1] = 56;
		data[2][2] = 58;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				System.out.print(data[i][j]+ "\t");
			}
			System.out.println("\n");
		}
		
		System.out.println(table[1][2]);
	}
}
