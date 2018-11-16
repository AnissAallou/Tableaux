package tableau1;

 
public class Exo5 {
	public static void main(String [] args) 
	{ 
		
	// Cet algorithme remplit un tableau avec les sept valeurs : 0, 1, 4, 9, 16, 25, 36, 49, 64, 81. 
	// Il les écrit ensuite à l’écran. 
			
			System.out.println("Exercice 5 Tableaux");
			
			int nombre[] = new int[10]; 
			
			for(int i=0; i<=9; i++) {
				nombre[i] = i * i;
			}
			for(int i=0; i<=9; i++) {
				System.out.print(nombre[i] + " ");
			}
			
			
			
			System.out.println("\n" + "\nVersion simplifiée : ");
			// Il s'agit d'une version en une boucle. On effectue le produit au carré
			// et affiche le tableau dans le même "for"

			
			for(int i=0; i<=9; i++) {
				nombre[i] = i * i;
				System.out.print(nombre[i] + " ");
			}
			
			 
	}
}
