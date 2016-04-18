import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

		
		System.out.println(" -------------------------");
		System.out.println("|    PROGRAMME DE TEST    |");
		System.out.println(" -------------------------\n");
		

		System.out.println("1 -| AFFICHAGE    |\n");
		System.out.println("2 -| TRAITEMENTS  |\n");
		
		 int choix = scanner.nextInt();
		 
		 if(choix == 1){
			
			 System.out.println("       ----------");
			 	System.out.println("1 -| SEJOURS  |");
				System.out.println("2 -| VOLS     |");
				System.out.println("3 -| AVIONS   |");
				System.out.println("4 -| ZONES    |");
				System.out.println("5 -| PARKINGS |");
				System.out.println("    ----------");
				
		     choix = scanner.nextInt();
			 
			 switch (choix) {
		        case 1:
		        	System.out.println("1 - Afficher la liste des sejours");
					System.out.println("2 - /");
					
					choix = scanner.nextInt();
						    switch (choix) {
					        case 1:
					        	// METHODE
					            break;
					        case 2:
					        	// METHODE
					            break;
					        default:
					          System.out.println("Veuillez entrer une valeur valide");
					    }
		            break;
		        case 2:
		        	System.out.println("1 - Afficher la liste des vols de départ");
				    System.out.println("2 - Afficher la liste des vols d'arrivé\n");
				    
				    choix = scanner.nextInt();
						    switch (choix) {
					        case 1:
					        	// METHODE
					            break;
					        case 2:
					        	// METHODE
					            break;
					        default:
					          System.out.println("Veuillez entrer une valeur valide");
					    }
		            break;
		        case 3:
		        	System.out.println("1 - Afficher la liste des avions");
					System.out.println("2 - Afficher les avions de grande taille\n");
					
					choix = scanner.nextInt();
						    switch (choix) {
					        case 1:
					        	// METHODE
					            break;
					        case 2:
					        	// METHODE
					            break;
					        default:
					          System.out.println("Veuillez entrer une valeur valide");
					    }
		            break;
		        case 4:
		        	System.out.println("1 - Afficher la liste des zones");
					System.out.println("2 - Afficher la liste des zones prioritaires");
				    System.out.println("3 - Afficher les parkings d'une zone\n");
				    
				    choix = scanner.nextInt();
						    switch (choix) {
					        case 1:
					        	// METHODE
					            break;
					        case 2:
					        	// METHODE
					            break;
					        case 3:
					        	// METHODE
					            break;
					        default:
					          System.out.println("Veuillez entrer une valeur valide");
					    }
					    
		            break;
		        case 5:
		        	System.out.println("1 - Afficher la liste des parkings");
					System.out.println("2 - Afficher les parkings disponibles");
					
					choix = scanner.nextInt();
						    switch (choix) {
					        case 1:
					        	// METHODE
					            break;
					        case 2:
					        	// METHODE
					            break;
					        default:
					          System.out.println("Veuillez entrer une valeur valide");
					    }
			    
		            break;
		        default:
		        	System.out.println("Veuillez entrer une valeur valide");
		    }		 
			 
		 }else if(choix == 2){
			 
			    System.out.println("    --------");
				System.out.println("1 -| AVIONS |");
				System.out.println("2 -| VOLS   |");
				System.out.println("    --------");
				
			     choix = scanner.nextInt();
				 
				 switch (choix) {
			        case 1:
			        	System.out.println("1 - Ajouter une liste d'avions (fichier)");
						System.out.println("2 - Ajouter un avion (manuellement)");
						
						choix = scanner.nextInt();
							    switch (choix) {
						        case 1:
						        	// METHODE
						            break;
						        case 2:
						        	// METHODE
						            break;
						        default:
						          System.out.println("Veuillez entrer une valeur valide");
						    }
			            break;
			        case 2:
			        	System.out.println("1 - Ajouter une liste de vols");
					    System.out.println("2 - Ajouter un vol (manuellement)");
					    System.out.println("3 - Annuler un vol");
					    System.out.println("4 - Retarder un vol");
					    
					    choix = scanner.nextInt();
							    switch (choix) {
						        case 1:
						        	// METHODE
						            break;
						        case 2:
						        	// METHODE
						        case 3:
						        	// METHODE
						            break;
						        case 4:
						        	// METHODE
						            break;
						        default:
						          System.out.println("Veuillez entrer une valeur valide");
						    }
			            break;
			        default:
			        	System.out.println("Veuillez entrer une valeur valide");
			    }		 

		
	}else {
		System.out.print("Veuillez entrer un numéro valide");
	}

					    

	}
}
