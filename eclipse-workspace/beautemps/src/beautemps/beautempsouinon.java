package beautemps;

import java.util.Scanner;

public class beautempsouinon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARATION
		
		String		reponse;
		
		
		//SAISIES
	
		Scanner sc = new Scanner(System.in);

		
		do
		{
			System.out.println("il fait beau ? oui/non");
			reponse = sc.next();
		} while (!(reponse.equals("oui")||reponse.equals("non")));

		
		
		sc.close();
		
		
		
		
	}

}
