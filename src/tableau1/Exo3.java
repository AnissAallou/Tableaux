package tableau1;
  
import java.util.Scanner;

public class Exo3 {
	public static void main(String[] args) 
	{ 

		
	     @SuppressWarnings("resource")
	 	Scanner sc = new Scanner(System.in);
	 			
	 	System.out.println("Exercice 3 Tableaux");
	 	// Ecrire un algorithme qui demande à l'utilisateur la grandeur du tableau et ses valeurs.
	 	// 1. Cet algorithme crée ce tableau et y insère les valeurs au fur et à mesure de la saisie. 
	 	// Le tableau est affiché à l'utilisateur.
	 	// 2. Un deuxième tableau devra maintenant contenir les valeurs du premier tableau dans 
	 	// l'ordre inverse que celui de la saisie. Ce nouveau tableau est affiché à l'utilisateur.
	 	
	 	System.out.println("saisir taille du tableau svp ! ");         
	 	int taille = Integer.parseInt(sc.nextLine());   
	 	// L'utilisateur entre le nombre de valeurs qu'il souhaite saisr dans le tableau
	 	
	 	int tableau [] = new int [taille];   
	 	//On passe en paramètre la variable taille qui se réfère au nombre de valeurs 
	 	//saisies par l'utilisateur 
	 	
	 	int elementsInverses [] = new int [taille]; 
	 	// on déclare le tableau inversé
	 	
	 	for(int i = 0; i < tableau.length; i++) {             
	 		System.out.println("saisir une valeur ");             
	 		tableau[i] =  Integer.parseInt(sc.nextLine());             
	 		elementsInverses[taille-1-i] = tableau[i];
	 		// le contenu du tableau inversé est affecté au premier tableau
	 		}
	 	
	 		System.out.println("tableau : ");         
	 		for(int i = 0; i < tableau.length; i++) {             
	 			System.out.println( tableau[i]);                      
	 		} // On affiche le tableau saisi    
	 	
	 		System.out.println("tableau inverse:  ");         
	 		for(int i = 0; i < elementsInverses.length; i++) {             
	 			System.out.println( elementsInverses [i]);         
	 		} // On affiche le tableau inversant les valeurs du tableau saisi
	 			
	  
	}
}
