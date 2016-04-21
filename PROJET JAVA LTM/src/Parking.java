import java.util.ArrayList;

//Dernière modification : 21/04/2016 (Thomas)

public abstract class Parking 
{
	
	private String idParking;
	private Zone secteur;
	private boolean disponible;
	private static ArrayList<Parking> lesParkings = new ArrayList<Parking>();
	
	public Parking(String idP, Zone sect)
	{
		this.idParking = idP;
		this.disponible = true;
		this.secteur = sect;
		lesParkings.add(this);
	}
	
	public void setZone(Zone z){
		secteur = z;
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
	
	public abstract String toString();
	public abstract Parking getLibre();
}
