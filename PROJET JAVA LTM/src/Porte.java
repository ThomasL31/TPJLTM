import java.util.ArrayList;

//Dernière modification : 17/04/2016 (Thomas)

public class Porte 
{
	private String idPorte;
	private Hall hallPorte;
	private static ArrayList<Porte> lesPortes = new ArrayList<Porte>();
	
	public Porte(String idP)
	{
		this.idPorte = idP;
		lesPortes.add(this);
	}

	public void afficherLesPortes()
	{
		for(Porte p : lesPortes)
			System.out.println(p.toString());
	}
	
	public String toString() 
	{
		return "Porte [idPorte=" + idPorte + ", hallPorte=" + hallPorte + "]";
	}
	
	
}
