package coupedecheveuxetudiant;

import java.util.Scanner;

public class pourcentagereduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//DECLARATION

		String		etudiant;
		String		mercredi;
		String		jeudi;

		//SAISIES

		System.out.println("Etes vous étudiant ?");
		Scanner sc = new Scanner(System.in);
		etudiant = sc.next();
		if(etudiant.equals("oui")); {
			System.out.println("Sommes-nous jeudi ?");
			jeudi = sc.next();
			if(jeudi.equals("oui")) {
				System.out.println("20% de réductions");
			else 
				System.out.println("Sommes-nous mercredi ?");
			

			}
		}











	}

}
