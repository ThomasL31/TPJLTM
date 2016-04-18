import java.util.ArrayList;
//Dernière modification : 17/04/2016 (Thomas)

public class Sejour 
{
	private String idSejour;
	private Vol arrive, depart;
	private Parking emplacement;
	private static ArrayList<Sejour> lesSejours = new ArrayList<Sejour>();
	
	public Sejour(String idS, Vol arr, Vol dep, Parking park)
	{
		this.idSejour = idS;
		this.arrive = arr;
		this.depart = dep;
		this.emplacement = park;
		emplacement.setDisponible(false);
		lesSejours.add(this);
	}
	
	public Duree tempsStationement()
	{
		Horaire h1 = arrive.getHeure(), h2 = depart.getHeure();
		
		return h1.tempsEcoule(h2);
	}
	public void setEmplacement(Parking newEmp)
	{
		this.emplacement.setDisponible(true);
		this.emplacement = newEmp;
		this.emplacement.setDisponible(false);	
	}
	
	public void afficherLesSejours()
	{
		for(Sejour s : lesSejours)
			System.out.println(s.toString());
	}
	
	public String toString() 
	{
		return "Sejour [idSejour=" + idSejour + ", arrive=" + arrive + ", depart=" + depart + ", emplacement="
				+ emplacement + "]";
	}
}
