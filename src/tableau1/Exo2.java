package tableau1;
  
import java.util.Scanner;

public class Exo2 {
	public static void main(String[] args) 
	{ 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		

	     
	 	System.out.println("Exercice 2 Tableaux");
		
	 	// Ecrire un algorithme qui déclare un tableau de 10 notes scolaires, 
	 	//dont on fait ensuite saisir les valeurs par l’utilisateur.
	 	// La somme des nombres est affichée à l'utilisateur.
	 	// La moyenne des notes de ce tableau est aussi affichée à l'utilisateur.
	 	
		int s;
		int[] notes = new int[10];

			
			s = 0;

			for(int i=0; i<10; i++) {
				System.out.println("Entrez la note numéro : " + (i + 1));
				// l’utilisateur de saisit les notes
			    notes[i] = sc.nextInt();
			    while (notes[i] < 0 || notes[i] > 20) {
			    	System.out.println("Une note est comprise entre 0 et 20 : ");
				    notes[i] = sc.nextInt();
				    // Tant qu'il ne rentre pas des notes comprises entre 0 et 20, 
				    // on signale à l'utilisateur que la saisie n'est pas valide 
				    // et on lui demande de recommencer
			    }
				s = s + notes[i]; // on calcule la somme des notes 
			}

			System.out.println("somme : " + s + " moyenne : " + s/10); 
			// on calcule la moyenne
			
		
		 
		
	}
}
