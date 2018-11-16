package tableau2;

public class Exo2 { 
	// Cet algorithme remplit un tableau avec les six valeurs : 0, 1, 2, 3, 4, 5. 
	// Il les écrit ensuite à l’écran. 
	
	public static void main(String[] args) {
	
	 System.out.println("Exercice 2 Tableaux multidimensionnels");
     
	   	int[][] tableau = new int[2][3]; 
		int valeur = 0;

		for(int i=0; i<=1; i++) {
			for(int j=0; j<=2; j++) {
				tableau[i][j] = valeur;
				valeur++;
			}
		}
		
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=2; j++) {
				System.out.print(tableau[i][j] + " ");
			}
		}
		
		
		System.out.println("\n" + "\n" + "Méthode simplifiée : ");
		// On fait tout en une boucle 
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=2; j++) {		
				System.out.print(tableau[i][j] + " ");
				tableau[i][j] = valeur;
				valeur++;
				
				
			}
		}
		
		
	}
}
