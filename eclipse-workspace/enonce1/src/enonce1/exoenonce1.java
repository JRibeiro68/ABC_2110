package enonce1;

import java.util.Scanner;

public class exoenonce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String compris;
		String compris2;
		
		System.out.println("Effectuez une lecture attentive de l'énoncé svp");
		System.out.println("Avez-vous compris l'énoncé? oui/non");
		Scanner sc = new Scanner(System.in);
		compris = sc.next();
		if(compris.equals("non"))
		{
			System.out.println("Relisez le svp !");
			System.out.println("Avez vous compris cette fois-ci? oui/non");
			compris2 = sc.next();
			if(compris2.equals("non")) 
			{
				System.out.println("demandez de l'aide");
			}
		}
		System.out.println("Ecrivez le pseudo-code");
		System.out.println("Verifiez le programme");
		System.out.println("Ecrivez le programme");
		System.out.println("Essayez le programme");
		
		
	}

}
