package airerayonplusangle;

import java.util.Scanner;

public class calculairerayonplusangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//DECLARATION DES VARIABLES
		//Double r
		double r;
		//Double a
		double a;
		//Double aire
		double aire;
	
		
		
		//SAISIES
		//ecrire "donnez moi le rayon svp:"
		System.out.println("Donnez moi le rayon svp:");
		//lire "r"
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		//ecrire "donnez moi l'angle a en degrés svp:"
		System.out.println("donnez moi l'angle a en degrés svp");
		//lire "a"
		a = sc.nextDouble();
		
		
		//TRAITEMENTS
		//aire <-- Math.PI*Math.pow(r,2)*a/360
		aire = (a/360*Math.PI*Math.pow(r,2));
		
		//AFFICHAGE
		//ecrire "l'aire du secteur circulaire est de :"+aire
		System.out.println("l'aire du secteur circulaire est de :"+aire);
		
				
		

		sc.close();
		
	}

}
