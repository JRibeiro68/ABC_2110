package ann�ebissextile;

import java.util.Scanner;

public class ann�ebissextileoupas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION

		//Chaine		ann�e
		int			ann�e;


		//SAISIES

		//ecrire		"Entrez une ann�e:"
		System.out.println("Entrez une ann�e");
		//lire			"ann�e"
		Scanner sc = new Scanner(System.in);
		ann�e = sc.nextInt();

		//TRAITEMENTS

		//Si 	(ann�e mod 4 == 0) OU (ann�e mod 100 == 0) ET (ann�e mod 400 = 0) Alors
		if (((ann�e % 4)== 0) && (!((ann�e % 100)== 0) && ((ann�e % 400) != 0))) {
			//ecrire		"C'est une ann�e bissextile"
			System.out.println("C'est une ann�e bissextile");
		}
		//Sinon
		else {
				System.out.println("Ce n'est pas une ann�e bissextile");
			}


			//ecrire		"Ce n'est pas une ann�e bissextile"
			//FinSi
		

		sc.close();	

	}

}
