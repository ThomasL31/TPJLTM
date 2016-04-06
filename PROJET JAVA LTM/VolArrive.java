import java.util.ArrayList;


public class VolArrive extends Vol 
{
	private String provenance;
	private ArrayList<VolArrive> lesVolsArrive = new ArrayList<VolArrive>();
	public VolArrive(String idV, Avion app, String dest) 
	{
		super(idV, app);
		provenance = dest;
		lesVolsArrive.add(this);
		
	}

}
