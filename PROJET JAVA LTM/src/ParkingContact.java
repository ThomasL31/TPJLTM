import java.util.ArrayList;
import java.util.Iterator;
import java.utils.Set;
//Dernière modification : 21/04/2016 (Thomas)

public class ParkingContact extends Parking
{
    private static ArrayList<ParkingContact> lesParkingsContact = new ArrayList<ParkingContact>();
    
    public ParkingContact(String idP, Zone sect)
    {
        super(idP, sect);
        lesParkingsContact.add(this);
    }    
    
    public Parking getLibre() //Renvoi la première place de parking libre
    {
        Parking libre = null;
        boolean trouve = false;
        set lesParks = lesParkingsContact.keySet();
        Iterator it = lesParks.iterator();
        while(it.hasNext() || !trouve)
        {
            ParkingContact pc = (ParkingContact) it.next();
            if(pc.getDisponible()==true)
                libre = pc;
        }
        
        return libre;
    }
    
    public String toString()//Méthode à générer avec éclipse
    {
        return ":";
    }
    
    public void afficherTout()
    {
        for(ParkingContact pc : lesParkingsContact)
        {
            pc.toString();
        }
    }
}
