import java.util.ArrayList;

//Modif 16/04/16 

public class Vol 
{
	private String idVol;
	private String appareil;
	private boolean annule;
	private boolean retarde;
	private Horaire heure;
	private static ArrayList<Vol> lesVols = new ArrayList<Vol>();
	
	public Vol(String idV, String app)
	{
		idVol = idV;
		appareil =app;
		retarde = false;
		annule = false;
		lesVols.add(this);
	}

	public void annuler()
	{
		annule = true;
	}
	
	public void retarder(Duree d)
	{
		retarde = true;
		heure = heure.ajout(d);
		
	}
	
	public void afficherAvion()
	{
		Avion av = Avion.getAvion(appareil);
		System.out.println(av.toString());

		
	}
	
	public void afficherTout()
	{
		for(Vol v : lesVols)
		{
			System.out.println(v.toString());
		}
		
		afficherAvion();
	}
	
	public String toString() 
	{
		return "Vol [idVol = " + idVol + ", appareil = " + appareil + ", annule = "
				+ annule + ", retarde = " + retarde + "]";
	}
	
	

}
