package inverseraetb;

import java.util.Scanner;

public class Inversernombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DECLARATION DES VARIABLES
		//int a
		int a;
		//int b
		int b;
		//int c
		int c;
		
		
		//SAISIES
		//ecrire "combien vaut a?"
		System.out.println("combien vaut a?");
		//lire "a"
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		//ecrire "combien vaut b?"
		System.out.println("combien vaut b?");
		//lire "b"
		b = sc.nextInt();

		
		//TRAITEMENTS
		//c <-- b
		c = b;
		//b <-- a
		b = a;		
		//a <-- b
		a = b;
		
		
		//AFFICHAGE
		//ecrire "a= "+c
		System.out.println("a= "+c);
		//ecrire "b= "+a
		System.out.println("b= "+a);
		
		
	
		sc.close();
		
	}

}
