import java.util.Scanner;

public class moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//traduction du pseudo code en code Java
		
		//DECLARATION DES VARIABLES
		
		//Réel nombre1
		float nombre1;
		//Réel nombre2
		float nombre2;
		//Réel moyenne
		float moyenne;
		
		//SAISIES
		//ecrire "Donnez moi svp le premier nombre:"
		System.out.println("Donnez moi svp le premier nombre:");
		//Lire nombre1
		Scanner sc = new Scanner(System.in);//creer un outil scanner(UNE SEULE FOIS SUFFIT)
		nombre1 = sc.nextFloat();
		System.out.println("Vous avez saisie le nombre1="+nombre1);
		
		//ecrire "Donnez moi svp le nombre2:"
		System.out.println("Donnez moi svp le nombre2:");
		//Lire nombre2
		nombre2 = sc.nextFloat();
		System.out.println("Vous avez saisie le nombre2="+nombre2);
		
		
		
		//TRAITEMENT
		//moyenne <-- (nombre1+nombre2)/2
		moyenne = (nombre1+nombre2)/2;
		
		
		//AFFICHAGE
		//ecrire "la valeur moyenne est :",moyenne
		System.out.println("la moyenne des nombres est ="+moyenne);
		
	}

}
