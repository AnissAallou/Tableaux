package tableau1;

import java.util.Scanner;
 
public class Exo4 {
	public static void main(String [] args) 
	{ 
		// Ecrire un algorithme qui demande � l'utilisateur la grandeur du tableau et ses valeurs.
		// Cet algorithme cr�e ce tableau et y ins�re les valeurs au fur et � mesure de la saisie.
		// Il indique ensuite � l'utilisateur :
		// 1. Si le tableau est tri� par ordre croissant ou non
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
	     boolean croissant = true; // on initialise le bool�en � Vrai car par d�faut on 
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
	            	 // d�croissant
	                 grand=tablo[i];
	             }else if(tablo[i]<petit){
	            	 // d�croissant
	                 petit = tablo[i];
	             }else if(tablo[i]<tablo[i-1]){
	            	 // d�croissant
	                 croissant = false;
	             }
	         }
	     }

	     System.out.println("grand = " + grand + ", petit = " + petit + ", croissant = " + croissant);
 			
	}
}
