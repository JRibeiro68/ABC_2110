import java.util.Scanner;

public class triordrecroissant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//DECLARATION DES VARIABLES

		//Entier	nombrea
		int			nombrea;
		//Entier	nombreb
		int			nombreb;


		//SAISIES
		//ecrire "Entrez le nombre a:"
		System.out.println("Entrez le nombre a:");
		//lire "nombrea"
		Scanner sc = new Scanner(System.in);
		nombrea = sc.nextInt();

		//ecrire "Entrez le nombre b:"
		System.out.println("Entrez le nombre b");
		//lire "nombreb"
		nombreb = sc.nextInt();


		//TRAITEMENT
		//Si	(nombrea < nombreb) Alors
		if		(nombrea<nombreb) {
			//ecrire "nombrea < nombreb"
			System.out.println(nombrea +"<"+ nombreb);
		}
		//Sinon Si(nombrea > nombreb)
		else if	(nombrea>nombreb) {
			//ecrire "nombreb < nombrea"
			System.out.println(nombreb +"<"+ nombrea);
		}
		//Sinon Si(nombrea = nombreb)
		else if (nombrea==nombreb) {
			//ecrire "nombrea = nombreb"
			System.out.println(nombrea +" et "+ nombreb +" sont égaux.");
		}


		sc.close();
	}

}
