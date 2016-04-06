import java.util.ArrayList;


public class Vol 
{
	private String idVol;
	private Avion appareil;
	private boolean annule;
	private boolean retarde;
	private Horaire heure;
	private static ArrayList<Vol> lesVols = new ArrayList<Vol>();
	
	public Vol(String idV, Avion app)
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
	
	public void afficherTout()
	{
		for(Vol v : lesVols)
		{
			System.out.println(v.toString());
		}
	}
	
	public String toString() 
	{
		return "Vol [idVol = " + idVol + ", appareil = " + appareil + ", annule = "
				+ annule + ", retarde = " + retarde + "]";
	}
	
	

}
