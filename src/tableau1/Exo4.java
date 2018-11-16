package tableau1;

import java.util.Scanner;
 
public class Exo4 {
	public static void main(String [] args) 
	{ 
		// Ecrire un algorithme qui demande à l'utilisateur la grandeur du tableau et ses valeurs.
		// Cet algorithme crée ce tableau et y insère les valeurs au fur et à mesure de la saisie.
		// Il indique ensuite à l'utilisateur :
		// 1. Si le tableau est trié par ordre croissant ou non
		// 2. La plus petite valeur du tableau
		// 3. La plus grande valeur du tableau
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercice 4 Tableaux");
		
		
		 System.out.println("Veuillez saisir une taille de tab");
	     int size = sc.nextInt();

	     int[] tablo = new int[size];
	     int nbr;
	     int petit = 0;
	     int grand = 0;
	     boolean croissant = true; // on initialise le booléen à Vrai car par défaut on 
	     // conceptualise le tableau dans l'ordre croissant

	     for(int i=0; i < size;i++){
	         System.out.println("Veuillez saisir une valeur");
	         nbr = sc.nextInt();
	         tablo[i] = nbr;
	         if(i==0){
	             grand = tablo[i];
	             petit = tablo[i];
	         }else{
	             if(tablo[i]>grand){
	            	 // décroissant
	                 grand=tablo[i];
	             }else if(tablo[i]<petit){
	            	 // décroissant
	                 petit = tablo[i];
	             }else if(tablo[i]<tablo[i-1]){
	            	 // décroissant
	                 croissant = false;
	             }
	         }
	     }

	     System.out.println("grand = " + grand + ", petit = " + petit + ", croissant = " + croissant);
 			
	}
}
