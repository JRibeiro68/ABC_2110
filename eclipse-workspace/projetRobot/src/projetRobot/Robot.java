package projetRobot;
import java.util.Scanner;
public class Robot {

	private String numeroDeSerie;
	private boolean enMarche;
	private String typeDeDeplacement;
	private boolean aDesBras;
	private float positionX;
	private float positionY;
	private float positionZ;

	//constructeur par default: il donne des valeurs par defaut aux attributs
	public Robot() {

		numeroDeSerie="0";
		enMarche=false;
		typeDeDeplacement="DeplacementPies";
		aDesBras=true;
		positionX=0;
		positionY=0;
		positionZ=0;
	}
	//constructeur classique: il donne les valeurs pass�es en parametre aux attributs
	public Robot(String numeroDeSerie,
			boolean _enMarche,
			String _typeDeDeplacement,
			boolean aDesBras,
			float _positionX,
			float _positionY,
			float _positionZ) {
		this.numeroDeSerie=numeroDeSerie;
		enMarche=_enMarche;
		typeDeDeplacement=_typeDeDeplacement;
		this.aDesBras=aDesBras;
		positionX=_positionX;
		positionY=_positionY;
		positionZ=_positionZ;
	}
	//fonction: il renvoie un boolean,ici true
	public boolean caVa(boolean ilfaitbeau) {
		if (ilfaitbeau==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	//procedure: ne renvoie rien (void=rien)
	public void caVa() {
	}
	public boolean demarrer()
	{
		if (enMarche==true)
		{
			return false;
		}
		else
		{
			enMarche=true;
			return true;
		}
	}
}
