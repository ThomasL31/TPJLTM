import java.util.ArrayList;


public class Zone 
{
	private int idZone;
	private String nomZone;
	private boolean prioritaire;
	private ArrayList<Parking> lesParkings = new ArrayList<Parking>(); // Contient les parking de la zone 
	private static ArrayList<Zone> lesZones = new ArrayList<Zone>(); // Contient les zones crées

	public Zone(int idZ, String nomZ,boolean prio)
	{
		idZone = idZ;
		nomZone = nomZ;
		prioritaire = prio;
		lesZones.add(this);
	}
	
	public void setParking(Parking p){
		lesParkings.add(p);
	}
	
	public void setPrioritaire(boolean prio){
		prioritaire = prio;
	}
	
	public String toString() 
	{
		return "Zone [" +idZone +"] " + nomZone + " | Prioritaire : " + prioritaire;
	}
	
	public void afficherTout()
	{
		System.out.println("Liste des zones :");
		
		for(Zone z : lesZones)
		{
			System.out.println(z.toString());
			
			System.out.println("Liste des parkings de cette zone : ");
			
			z.afficherParkings();
		}
		
	}
	
	public void afficherParkings(){
		for (Parking p : lesParkings){
			System.out.println(p.toString());
		}
	}
}
