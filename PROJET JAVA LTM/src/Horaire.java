/*Modif du 17/04/2016 
	  Ajout d'une m�thode permettant de calculer le temps �coul�s entre deux horraires
*/	 


//Derni�re modification : 17/04/2016 (Thomas)	

public class Horaire implements Comparable, Cloneable
{
	
  private int heures,minutes;

  public Horaire() 
  {
    heures=0;
    minutes=0;
  }


  public Horaire(int h,int m) 
  {
    heures=h;
    minutes=m;
  }

  public Horaire(int m)
  {
    m=m%1440;
    heures=m/60;minutes=m%60;
  }

  public int horaireEnMinutes()
  {
     return heures*60+minutes;
  }
  
  public Duree tempsEcoule(Horaire h)
  {
	  return new Duree(h.horaireEnMinutes() - this.horaireEnMinutes());
  }

  public Horaire ajout(Duree d)
  {
    int h=horaireEnMinutes()+d.dureeEnMinutes();
    if(h>=1440)
      h=h%1440;

   return new Horaire(horaireEnMinutes()+d.dureeEnMinutes());
  }

   public Horaire retrait(Duree d)
   {
     int h=horaireEnMinutes()-d.dureeEnMinutes();
     while(h<0)
       h=h+1440;
     return new Horaire(h);
   }

   public Duree retrait(Horaire h)
   {
     int  m=this.horaireEnMinutes()-h.horaireEnMinutes();
     if(m<0) m=-m;
     
     return new Duree(m);
   }


   public String toString()
   {
     String tHeures=heures +" h ";
     String tMinutes=((minutes<10)?"0":"")+minutes;
     String info=tHeures+tMinutes;
     
    return info;
   }

   public void afficher()
   {
     System.out.println(toString());
   }

   public int compareTo(Object o)
   {
     Horaire h=(Horaire) o;

     return horaireEnMinutes()-h.horaireEnMinutes();
   }


   public Object clone()throws CloneNotSupportedException
   {
    Horaire h=(Horaire)super.clone();

    return h;
   }

  
 public boolean equals(Object o)
 {
	  Horaire h=(Horaire) o;

	  return this.horaireEnMinutes()==h.horaireEnMinutes();
   }



}
