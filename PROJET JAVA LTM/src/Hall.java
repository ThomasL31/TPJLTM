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

	public void affecterPorte(Porte p)//Ajouter une porte à un hall
	{
		porteHall.add(p);
	}
	
	public void afficherPortes()//Afficher les portes d'un hall
	{
		for(Porte p : porteHall)
			System.out.println(p.toString());
	}
	
	public void afficherLesHalls()
	{
		for(Hall h : lesHalls)
			System.out.println(h.toString());
	}
	public String toString() 
	{
		return "Hall [idHall=" + idHall + ", porteHall=" + porteHall + "]";
	}
}
