package tableau1;

import java.util.Scanner;
 
public class Exo11 {
	public static void main(String [] args) 
	{ 
	
	// Ecrivez un algorithme qui permet la saisie d’un nombre quelconque de valeurs.
	// Toutes les valeurs doivent ensuite être augmentées de 1, et le tableau sera affiché à l’écran. 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
			
			System.out.println("Exercice 11 Tableaux");
			int taille; 


			System.out.println("Entrez le nombre de valeurs :");
			taille = sc.nextInt();
			int[] tble = new int[taille];

			for(int i=0; i<tble.length; i++) {
					System.out.println("Entrez le nombre numéro : " + (i + 1));
					tble[i] = sc.nextInt();
					tble[i] = tble[i] + 1; // On incrémente à 1 toutes les valeurs du tableau
					

			}
			
			System.out.println("Nouveau tableau : ");
			
			for(int i=0; i<tble.length; i++) {
				System.out.print(tble[i] + " ");
			}
			
			
	}
}
