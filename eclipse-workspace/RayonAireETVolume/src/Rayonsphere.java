import java.util.Scanner;

public class Rayonsphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARATION DES VARIABLES
		//Réel r
		float r;
		//Réel aire
		float aire;
		//Réel volume
		float volume;
		
		//SAISIES
		//ecrire "donnez moi le rayon svp:"
		System.out.println("Donnez moi le rayon svp:");
		//lire "r"
		Scanner sc = new Scanner(System.in);
		r = sc.nextFloat();
		
		//TRAITEMENTS
		//aire <-- 4*Math.PI*Math.pow(r,2)
		aire = (float) (4*Math.PI*Math.pow(r,2));
		//volume <--4/3*Math.PI*Math.pow(r,3=)
		volume = (float) (4/3*Math.PI*Math.pow(r,3));
		
		//AFFICHAGE
		System.out.println("l'air est de ="+aire);
		System.out.println("le volume est de ="+volume);
		
		
		
	}

}
