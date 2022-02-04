package exoenonce2;

import java.util.Scanner;

public class enonce2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		String	beauTemps;
		String	bonEtat;
		String	reparation;
		String	mmeBovaryTrouve;
		String	mmeBovaryDispo;

		System.out.println("Fait-il beau ce matin? oui/non");
		Scanner sc = new Scanner(System.in);
		beauTemps = sc.next();
		if (beauTemps.equals("oui"))
		{
			System.out.println("La bicyclette est-elle en bon état? oui/non");
			bonEtat = sc.next();
			if(bonEtat.equals("oui"))
			{
				System.out.println("Aller faire une ballade");
			}
			else {
				System.out.println("Passer chez le garagiste");
				System.out.println("La réparation est elle immédiate? oui/non");
				reparation = sc.next();
				if(reparation.equals("non")) 
				{

					System.out.println("Aller à pied à l'étang");
					System.out.println("Ceuillir des joncs");
				}
				else {
					System.out.println("Aller faire une ballade");
				}
			}
		}
		else {
			System.out.println("Consacrer votre journée à la lecture");
			System.out.println("Chercher le livre dans la bibliothèque du salon");
			System.out.println("avez-vous trouvé le livre Madame Bovary? oui/non");
			mmeBovaryTrouve = sc.next();
			if(mmeBovaryTrouve.equals("non"))
			{
				System.out.println("Aller à la bibliothèque municipale");
				System.out.println("Madame Bovary est-il disponible? oui/non");
				mmeBovaryDispo = sc.next();
				if(mmeBovaryDispo.equals("non"))
				{
					System.out.println("Emprunter un livre policier");
					System.out.println("Rentrer directement à la maison");
					System.out.println("S'installer confortablement dans un fauteuil");
					System.out.println("Vous plongez dans la lecture");
				}
				else {
					System.out.println("Emprunter Mme Bovary");
					System.out.println("Rentrer directement à la maison");
					System.out.println("S'installer confortablement dans un fauteuil");
					System.out.println("Vous plongez dans la lecture");
				}
			}
			else {
				System.out.println("S'installer confortablement dans le fauteuil");
				System.out.println("Se plonger dans la lecture");
			}
		}




		sc.close();
	}
}










