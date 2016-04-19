import java.util.*;

/*Modif du 17/04/2016 
  Ajout d'une méthode permettant de connaitre la taille d'un avion  
*/
 

//Dernière modification : 17/04/2016 (Thomas)

public class Avion 
{

	private String immatriculation, marque, modele;
	private boolean estGrand;
	private static Hashtable<String,Avion> lesAvions = new Hashtable<String,Avion>();
	
	public Avion(String immat, String mar, String mod, boolean estG)
	{
		
		immatriculation = immat;
		marque = mar;
		modele = mod;
		lesAvions.put(this.immatriculation,this);
	}

	public void afficherTout()
	{
		for(String i : lesAvions.keySet())
		{
		 System.out.println(lesAvions.get(i).toString());
		}
	}
	
	public String toString() 
	{
		return "Avion [" + immatriculation + "]" + ", marque :"
				+ marque + ", modele : " + modele + ", estGrand : " + estGrand;
	}
	
	public static Avion getAvion(String immat) //retourne un avion à partir de son immatriculation
	{ 
		return lesAvions.get(immat);
	}
	public String getImmat()
	{
		return immatriculation;
	}
	public boolean getTaille()
	{
		return estGrand;
	}
}
