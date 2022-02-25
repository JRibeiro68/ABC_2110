package rappelTableauJava;

import java.util.Arrays;
import java.util.Scanner;

public class rechercherUnNombreDansUnTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int	tableauDeNombreEntier []= new int [10];

		int	number;
		int	temp = 0;
		int valeurRecherchee;
		int compteur = 0;
		int index = -1;

		
		//TABLEAU: Saisie des nombres

		for (int i=0;i<tableauDeNombreEntier.length;i++) {
			System.out.println("Veuillez saisir un nombre entier svp");
			number = sc.nextInt();
			tableauDeNombreEntier [i] = number;
		}

		
		//TABLEAU: Tri croissant des nombres simplifi�s

		Arrays.sort(tableauDeNombreEntier);
		for(int i=0;i<tableauDeNombreEntier.length;i++) {
			System.out.print(tableauDeNombreEntier[i] +"-"); //Pour afficher en ligne ne surtout pas mettre le "ln" apr�s "print"
		}

		
		//TABLEAU: Tri des nombres versions algorithme
		
		for (int i=0;i<tableauDeNombreEntier.length;i++) {
			for(int j=i;j<tableauDeNombreEntier.length;j++) { //� partir de ce point le programme compare les donn�es
				if(tableauDeNombreEntier[i]>tableauDeNombreEntier[j]) {
					temp = tableauDeNombreEntier[i];
					tableauDeNombreEntier[i] = tableauDeNombreEntier[j];
					tableauDeNombreEntier[j] = temp;
					j--; //sert � v�rifier que le nombre qui a �t� �chang� est quand m�me plus petit que les suivants
				}
			}
			System.out.println(tableauDeNombreEntier[i]);
		}
		
		
		//Chercher combien de fois la m�me valeur est dans le tableau
		
		System.out.println("Saisissez le nombre � rechercher svp;");
		valeurRecherchee = sc.nextInt();
		for (int i=0;i<tableauDeNombreEntier.length;i++) {
			if ( valeurRecherchee == tableauDeNombreEntier[i]) {
				compteur++;
			}
		}
		if(compteur == 0) {
			System.out.println("Le nombre recherch� n'existe pas!!");
		}
		else {
			System.out.println("Le nombre " + valeurRecherchee + valeurRecherchee +" est entre fois "+compteur+" dans le tableau java\n");
		}
		
		//Trouver emplacement du tableau ou se trouve le nombre recherch�
		
		System.out.println("Saisissez le nombre � rechercher svp:");
		valeurRecherchee = sc.nextInt();
		for (int i = 0; i<tableauDeNombreEntier.length;i++) {
			if ( valeurRecherchee == tableauDeNombreEntier[i]) {
				index = i;
				System.out.println("Le nombre recherch� se trouve � l'emplacement"+i);
			}
		}
		if (index<0) {
			System.out.println("Le nombre n'existe pas");
		}
		sc.close();
}

}
