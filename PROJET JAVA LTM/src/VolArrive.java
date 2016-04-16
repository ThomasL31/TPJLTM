import java.util.ArrayList;


public class VolArrive extends Vol 
{
	private String provenance;
	private ArrayList<VolArrive> lesVolsArrive = new ArrayList<VolArrive>();
	
	public VolArrive(String idV, String app, String prov) 
	{
		super(idV, app);
		provenance = prov;
		lesVolsArrive.add(this);
		
	}
	public String toString(){
	return "VOL ARRIVE - ID : [" + getIdVol()+ "]" + 
	"En provenance de : " + provenance + 
	" appareil = " + getAppareil() +
	"| annulé : "	+ isAnnule() + ", retardé : " + isRetarde() + " |";

	}
	
	public void afficherTout(){
		
		for(Vol v : lesVolsArrive)
	{
		System.out.println(v.toString());
		v.afficherAvion();
	}
	
	}
	

}
