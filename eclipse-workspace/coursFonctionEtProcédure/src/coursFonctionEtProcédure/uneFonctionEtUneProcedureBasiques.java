package coursFonctionEtProcédure;

import java.util.Scanner;

public class uneFonctionEtUneProcedureBasiques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phrase ;
		
		double nb1 ;
		double nb2 ;
		double leResultat ;
		
		System.out.println ("Entrez une phrase ou un texte.") ;
		Scanner sc = new Scanner(System.in);
		phrase = sc.nextLine() ;
		
		//Appel de la procédure ecritUnMessage()
		ecritUnMessageSimple (phrase) ;
		
		System.out.println("Entrez un nombre.") ;
		nb1 = sc.nextDouble() ;
				
		System.out.println("Saisissez un 2èeme nombre");
		nb2 = sc.nextDouble() ;
		
		//Appel de la fonction additionner()
		leResultat = additionner(nb1 , nb2) ;
		
		System.out.println("La somme de ces deux nombres est : " + leResultat) ;
		
	}

	/* Déclaration des méthodes ecritUnMessage() et additionner()
	 * dans la classe uneFonctionEtUneProcedureBasiques
	 * donc en dehors de la procédure main */
	
	public static void ecritUnMessageSimple (String message) {
		System.out.println ("Bonjour ! "+ message +". Au revoir !") ;
	}

	public static double additionner (double nombre1 , double nombre2) {
		double resultat ;
		resultat = nombre1 + nombre2 ;
		return resultat ;
		

	}
	
	
}
