import java.util.ArrayList;

//Modif 16/04/16 

public abstract class Vol 
{
	private String idVol;
	private String appareil;
	private boolean annule;
	private boolean retarde;
	private Horaire heure;
	
	public Vol(String idV, String app)
	{
		idVol = idV;
		appareil =app;
		retarde = false;
		annule = false;
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
	
	public abstract void afficherTout();
	
	public abstract String toString();

	public String getIdVol() 
	{
		return idVol;
	}

	public Horaire getHeure()
	{
		return heure;
	}
	
	public String getAppareil() 
	{
		return appareil;
	}

	public boolean isAnnule() 
	{
		return annule;
	}

	public boolean isRetarde() 
	{
		return retarde;
	}

	
	

}
