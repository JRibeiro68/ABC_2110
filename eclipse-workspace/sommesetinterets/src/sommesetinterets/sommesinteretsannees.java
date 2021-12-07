"package sommesetinterets;

import java.text.DecimalFormat;
import java.util.Scanner;

public class sommesinteretsannees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DECLARATION DE VARIABLES
		//float s
		float s;
		//float i
		float i;
		//Int n
		int n;
		//float vais
		double vais;
		//float vaic
		double vaic;
		
		//SAISIES
		//ecrire "Donnez moi la somme initiale svp:"
		System.out.println("Donnez moi la somme initiale svp:");
		//lire "s"
		Scanner sc = new Scanner(System.in);
		s = sc.nextFloat();
		//ecrire "Veuillez indiquer le taux d'interet svp:"
		System.out.println("Veuillez indiquer le taux d'interet svp:");
		//lire "i"
		i = sc.nextFloat();
		//ecrire "La somme sera placé combien d'années svp?"
		System.out.println("La somme sera placé combien d'années svp?");
		n = sc.nextInt();
		
		//TRAITEMENTS
		//vais <-- s(1+n*i)
		vais = (double)(s*(1+n*i));
		//vaic <-- s(1+i)(Math.pow(i,n)
		vaic = (double)(s*Math.pow(1+i,n));
		
		//AFFICHAGE
		DecimalFormat df = new DecimalFormat("0.00");
		//ecrire "les intérêts simples sont de :"+vais
		System.out.println("les intérêts simples sont de :"+df.format(vais));
		//ecrire "les intérêts composés sont de :"+vaic
		System.out.println("les intérêts composés sont de :"+df.format(vaic));

		
		sc.close();

	}

}
