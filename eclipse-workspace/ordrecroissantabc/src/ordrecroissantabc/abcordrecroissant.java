package ordrecroissantabc;

import java.util.Scanner;

public class abcordrecroissant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION DES VARIABLES

		int		a;
		int		b;
		int		c;

		//SAISIES

		System.out.println("Entrez le nombre a:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		System.out.println("Entrez le nombre b:");
		b = sc.nextInt();

		System.out.println("Entrez le nombre c");
		c = sc.nextInt();

		//TRAITEMENTS

		if		(a<b&&b<c) {
			System.out.println(a +"<"+ b +"<"+ c);
		}
		else if	(a<c&&c<b) {
			System.out.println(a +"<"+ c +"<"+ b);
		}
		else if (b<a&&a<c) {
			System.out.println(b +"<"+ a +"<"+ c);
		}
		else if (b<c&&c<a) {
			System.out.println(b +"<"+ c +"<"+ a);
		}
		else if (c<a&&a<b) {
			System.out.println(c +"<"+ a +"<"+ b);
		}
		else if (c<b&&b<a) {
			System.out.println(c +"<"+ b +"<"+ a);
		}


		sc.close();

	}

}
