import java.util.ArrayList;


public class VolDepart extends Vol 
{
	private String destination;
	private ArrayList<VolArrive> lesVolsArrive = new ArrayList<VolArrive>();
	public VolArrive(String idV, Avion String, String dest) 
	{
		super(idV, app);
		destination = dest;
		lesVolsArrive.add(this);
		
	}
	
	public VolDepart(String idV, Avion app) 
	{
		super(idV, app);
	}

}
