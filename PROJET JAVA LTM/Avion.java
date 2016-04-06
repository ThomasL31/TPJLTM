import java.util.ArrayList;


public class Avion 
{

	private String immatriculation, marque, modele;
	private boolean estGrand;
	private static ArrayList<Avion> lesAvions = new ArrayList<Avion>();
	
	public Avion(String immat, String mar, String mod, boolean estG)
	{
		
		immatriculation = immat;
		marque = mar;
		modele = mod;
		lesAvions.add(this);
	}

	public void afficherTout()
	{
		for(Avion a : lesAvions)
		{
			System.out.println(a.toString());
		}
	}
	
	public String toString() 
	{
		return "Avion [immatriculation = " + immatriculation + ", marque = "
				+ marque + ", modele = " + modele + ", estGrand = " + estGrand
				+ "]";
	}
	//Wesh Alors
}
