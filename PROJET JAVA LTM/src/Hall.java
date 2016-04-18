import java.util.ArrayList;

//Dernière modification : 17/04/2016 (Thomas)

public class Hall 
{
	private int idHall;
	private ArrayList<Porte> porteHall = new ArrayList<Porte>();
	private static ArrayList<Hall> lesHalls = new ArrayList<Hall>();
	
	public Hall(int idH)
	{
		this.idHall = idH;
		lesHalls.add(this);
	}

	
	public String toString() 
	{
		return "Hall [idHall=" + idHall + ", porteHall=" + porteHall + "]";
	}
}
