import java.util.ArrayList;

public class Parking 
{
	
	private String idParking;
	private boolean disponible;
	private static ArrayList<Parking> lesParkings = new ArrayList<Parking>();
	
	public Parking(String idP)
	{
		idParking = idP;
		disponible = true;
		lesParkings.add(this);
	}
	
	public boolean getDisponible()
	{
		return disponible;
	}
	
	public void setDisponible(boolean dispo)
	{
		disponible = dispo;
	}
	public void afficherTout()
	{
		for(Parking p : lesParkings)
		{
			System.out.println(p.toString());
		}
	}
	
	
	public String toString() 
	{
		return "Parking [idParking=" + idParking + ", disponible=" + disponible
				+ ", lesParkings=" + lesParkings + "]";
	}
}
