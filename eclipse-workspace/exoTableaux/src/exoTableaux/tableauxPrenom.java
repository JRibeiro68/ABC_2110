package exoTableaux;

public class tableauxPrenom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 650;
		int pricephone = 600;
		boolean hasPhone = false;
		
		if(money >= pricephone && !hasPhone) {
			System.out.println("tu peux acheter ce téléphone");
		} else {
			System.out.println("tu n'as pas assez d'argent pour acheter ce téléphone et en plus tu as déja un téléphone");
		}
		
		//déclarer le tableau, le nommer et taper les éléments stockés
		String[] names = { "José", "Bouniaf", "Rudolph" };
		
		//Afficher le contenu du tableau
		System.out.println(names[1]);
		if(names[0].equalsIgnoreCase(names[1])){
			System.out.println("même chose");
		}else {
			System.out.println("pas la même chose");
			System.out.println(names.length);
			
			
		}

	}

}
