package tableau1;

 
public class Exo6 {
	public static void main(String [] args) 
	{ 
		
	// Cet algorithme remplit un tableau avec les sept valeurs : 1, 3, 5, 7, 9, 11, 13. 
	// Il les écrit ensuite à l’écran. 
		
			System.out.println("Exercice 6 Tableaux");
			
			int[] nombre = new int[7];

			
			nombre[0] = 1;
			for(int k=1; k<nombre.length; k++) { 
			nombre[k]= nombre[k-1] + 2; // incrémentation de 2 à chaque tour de boucle
			}
			for(int i=0; i<nombre.length; i++) {
			System.out.print(nombre[i] + " ");
			}
			
			// On peut le faire en une boucle 
			System.out.println("Version simplifiée");
			nombre = new int[8];	
			nombre[0] = -1;
			for(int k=1; k<nombre.length; k++) { 
				nombre[k]= nombre[k-1] + 2;
				System.out.print(nombre[k] + " ");
			}
				
	}
}
