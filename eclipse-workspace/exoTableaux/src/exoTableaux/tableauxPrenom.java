package exoTableaux;

public class tableauxPrenom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 650;
		int pricephone = 600;
		boolean hasPhone = false;
		
		if(money >= pricephone && !hasPhone) {
			System.out.println("tu peux acheter ce t�l�phone");
		} else {
			System.out.println("tu n'as pas assez d'argent pour acheter ce t�l�phone et en plus tu as d�ja un t�l�phone");
		}
		
		//d�clarer le tableau, le nommer et taper les �l�ments stock�s
		String[] names = { "Jos�", "Bouniaf", "Rudolph" };
		
		//Afficher le contenu du tableau
		System.out.println(names[1]);
		if(names[0].equalsIgnoreCase(names[1])){
			System.out.println("m�me chose");
		}else {
			System.out.println("pas la m�me chose");
			System.out.println(names.length);
			
			
		}

	}

}
