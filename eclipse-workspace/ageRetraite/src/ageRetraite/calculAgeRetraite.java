package ageRetraite;

import java.util.Scanner;

public class calculAgeRetraite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ageActuel;
		System.out.println("indiquez votre âge svp:");

		Scanner sc = new Scanner(System.in);
		ageActuel = sc.nextInt();
		System.out.println(getRetired(ageActuel));
		sc.close(); }
	public static String getRetired(int ageSaisi)
	{
		int retraite=60;
		int resultat;
		if (ageSaisi>0 && ageSaisi<retraite)
		{
		resultat = retraite-ageSaisi;
		return ("il vous reste "+resultat+" ans avant la retraite");
		}
		else if (retraite==ageSaisi)
		{
			return "Vous ètes à la retraite !";
		}
		else if (ageSaisi>retraite)
		{
			resultat = ageSaisi-retraite;
			return ("Vous êtes à la retraite depuis "+resultat+" an(s). Profitez!!");
		}
		else
		{
			return "Avant  de penser à la retraite, vous devriez d'abord apprendre à marcher";
			
		}
	}

}
