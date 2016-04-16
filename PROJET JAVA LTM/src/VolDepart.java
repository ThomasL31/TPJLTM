import java.util.ArrayList;


public class VolDepart extends Vol 
{
	private String destination;
	private ArrayList<VolDepart> lesVolsDepart = new ArrayList<VolDepart>();
	
	public VolDepart(String idV, String app,String dest) 
	{
		super(idV, app);
		destination = dest;
		lesVolsDepart.add(this);
	}
	
	public String toString(){
	return "VOL DEPART - ID : [" + getIdVol()+ "]" + 
	"A destination de : " + destination + 
	" appareil = " + getAppareil() +
	"| annul� : "	+ isAnnule() + ", retard� : " + isRetarde() + " |";

	}
	
	public void afficherTout(){
		
		for(Vol v : lesVolsDepart)
	{
		System.out.println(v.toString());
		v.afficherAvion();
	}
	
	}
	

}
