import java.util.ArrayList;
//Dernière modification : 21/04/2016 (Thomas)

public class ParkingHorsContact extends Parking
{
    private static ArrayList<ParkingHorsContact> lesParkingsHorsContact = new ArrayList<ParkingHorsContact>();
    
    public ParkingContact(String idP, Zone sect)
    {
        super(idP, sect);
        lesParkingsHorsContact.add(this);
    }    
    
    public Parking getLibre()//Renvoi la première place de parking hors contact libre
    {
        Parking libre = null;
        boolean trouve = false;
        set lesParks = lesParkingsHorsContact.keySet();
        Iterator it = lesParks.iterator();
        while(it.hasNext() || !trouve)
        {
            ParkingHorsContact phc = (ParkingHorsContact) it.next();
            if(phc.getDisponible()==true)
                libre = phc;
        }
        
        return libre;
    }
    
}
