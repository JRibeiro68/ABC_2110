package exoenonce2;

import java.util.Scanner;

public class enonce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String	beauTemps;
		String	bonEtat;
		String	reparationImmediate;
		String	mmeBovaryTrouve;
		String	mmeBovaryDispo;
		
		System.out.println("Fait-il beau ce matin? oui/non");
		Scanner sc = new Scanner(System.in);
		beauTemps = sc.next();
		if(beauTemps.equals("oui"));
		{
			System.out.println("La bicyclette est-elle en bon �tat? oui/non");
			bonEtat = sc.next();
			if(bonEtat.equals("oui"));
			{
				System.out.println("Aller faire une ballade");
			else
				System.out.println("Passer chez le garagiste");
				System.out.println("La r�paration est elle imm�diate? oui/non");
				reparationImmediate = sc.next();
				if(reparationImmediate.equals("non"));
				{
					System.out.println("Aller � pied � l'�tang");
					System.out.println("Ceuillir des joncs");
					else
						System.out.println("Aller faire une ballade");
				}
			}
		else
			System.out.println("Consacrer votre journ�e � la lecture");
			System.out.println("Chercher le livre dans la biblioth�que du salon");
			System.out.println("avez-vous trouv� le livre Madame Bovary? oui/non");
			mmeBovaryTrouve = sc.next();
			if(mmeBovaryTrouve.equals("non"));
			{
				System.out.println("Aller � la biblioth�que municipale");
				System.out.println("Madame Bovary est-il disponible? oui/non");
				mmeBovaryDispo = sc.next();
				if(mmeBovaryDispo.equals("non"));
				{
					System.out.println("Emprunter un livbre policier");
					System.out.println("Rentrer directement � la maison");
					System.out.println("S'installer confortablement dans un fauteuil");
					System.out.println("Vous plongez dans la lecture");
				else
						
				}
			}
			
			
		}
		
		
		
	}

}
