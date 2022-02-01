import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {

		int ageAtester = 18;

		System.out.println("indiquez votre âge svp:");

		String resultat = estIlMajeur(ageAtester);

		Scanner sc = new Scanner(System.in);
		resultat = sc.next();

	}//fin main

	public static String estIlMajeur(int age) {
		if(age >= 18) {
			return "Majeur !";

		}
		else {
			return "Mineur !";
		}

	}

}// fin de la classe
