package main;

import java.util.Scanner;


public class KandangAyam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String splited[];
		float jmlAyam, jmlAyamdiKandang;
		Scanner in = new Scanner(System.in);
		splited = in.nextLine().split(" ");
		jmlAyam = Float.parseFloat(splited[0]);
		jmlAyamdiKandang = Float.parseFloat(splited[1]);

		System.out.println(Math.ceil(jmlAyam/jmlAyamdiKandang));
	}

}
