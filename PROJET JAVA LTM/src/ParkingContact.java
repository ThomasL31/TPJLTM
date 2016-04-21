import java.util.ArrayList;
//Dernière modification : 21/04/2016 (Thomas)

public class ParkingContact extends Parking
{
    private static ArrayList<ParkingContact> lesParkingsContact = new ArrayList<lesParkingsContact>();
    
    public ParkingContact(String idP, Zone sect)
    {
        super(idP, sect);
        lesParkingsContact.add(this);
    }    
    
    public Parking getLibre()
    {
      
    }
    
}
