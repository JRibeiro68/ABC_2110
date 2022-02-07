package SeparerChaine;

public class Programme {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		Scanner sc  = new Scanner(System.in);
		
		String saisie = "12 mi";
		
		saisie = saisie.trim();
		// comment séparer "12" et "mi" ?
		
		String[] tableau = saisie.split(" ");
		
		int valeur = Integer.valueOf("1234");
		
		System.out.println("");

	}

}
