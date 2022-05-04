package coursTableaux;

import java.util.Scanner;

public class exerciceTableauxPise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int tableau[] / int[] tableau
		 * int tableau[] = {1, 2, 3}
		 * int tableau[] = new int [3]
		 * int tableau[] = new int[]{1, 2, 3}
		 */

		int[] tableau = {1, 2, 3};
		
		//1ère façon d'afficher le tableau
		System.out.println(tableau[0]);
		System.out.println(tableau[1]);
		System.out.println(tableau[2]);


		Scanner sc = new Scanner(System.in);
		
		//2ème façon d'afficher le tableau avec une boucle "for"
		for(int i = 0 ; i < tableau.length ; ++i)
			System.out.println(tableau[i]);
		
		
		
		sc.close();

	}

}
