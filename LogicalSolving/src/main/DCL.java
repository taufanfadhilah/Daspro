package main;

import java.util.Scanner;

public class DCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int row,column;
		String splitted[], stiker[] = {
				"...................",
				".####...####..#....",
				".#...#..#.....#....",
				".#...#..#.....#....",
				".####...####..####.",
				"..................."
		};
		splitted = in.nextLine().split(" ");
		row = Integer.parseInt(splitted[0]);
		column = Integer.parseInt(splitted[1]);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < stiker.length; j++) {
				for (int j2 = 0; j2 < column; j2++) {
					System.out.print(stiker[j]);
				}
				System.out.println();
			}
		}
	}

}
