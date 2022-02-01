package annéebissextile;

import java.util.Scanner;

public class annéebissextileoupas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION

		//Chaine		année
		int			année;


		//SAISIES

		//ecrire		"Entrez une année:"
		System.out.println("Entrez une année");
		//lire			"année"
		Scanner sc = new Scanner(System.in);
		année = sc.nextInt();

		//TRAITEMENTS

		//Si 	(année mod 4 == 0) OU (année mod 100 == 0) ET (année mod 400 = 0) Alors
		if (((année % 4)== 0) && (!((année % 100)== 0) && ((année % 400) != 0))) {
			//ecrire		"C'est une année bissextile"
			System.out.println("C'est une année bissextile");
		}
		//Sinon
		else {
				System.out.println("Ce n'est pas une année bissextile");
			}


			//ecrire		"Ce n'est pas une année bissextile"
			//FinSi
		

		sc.close();	

	}

}
