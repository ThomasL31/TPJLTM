import java.util.ArrayList;


public class Zone 
{
	private int idZone;
	private String nomZone;
	private ArrayList<Parking> parkingZone;
	private static ArrayList<Parking> lesParkings = new ArrayList<Parking>();

	public Zone(int idZ, String nomZ, ArrayList<Parking> parkZone)
	{
		idZone = idZ;
		nomZone = nomZ;
		parkingZone = parkZone;
	}
}
