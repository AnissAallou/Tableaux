package tableau1;

 
public class Exo5 {
	public static void main(String [] args) 
	{ 
		
	// Cet algorithme remplit un tableau avec les sept valeurs : 0, 1, 4, 9, 16, 25, 36, 49, 64, 81. 
	// Il les �crit ensuite � l��cran. 
			
			System.out.println("Exercice 5 Tableaux");
			
			int nombre[] = new int[10]; 
			
			for(int i=0; i<=9; i++) {
				nombre[i] = i * i;
			}
			for(int i=0; i<=9; i++) {
				System.out.print(nombre[i] + " ");
			}
			
			
			
			System.out.println("\n" + "\nVersion simplifi�e : ");
			// Il s'agit d'une version en une boucle. On effectue le produit au carr�
			// et affiche le tableau dans le m�me "for"

			
			for(int i=0; i<=9; i++) {
				nombre[i] = i * i;
				System.out.print(nombre[i] + " ");
			}
			
			 
	}
}
