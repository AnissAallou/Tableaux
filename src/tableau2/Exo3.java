package tableau2;

public class Exo3 {

	// Cet algorithme remplit un tableau avec huit valeurs : 0, 1, 0, 1, 0, 1, 0, 1.
	// Cela ressemble à du binaire :p
	
	public static void main(String[] args) {
			
		 
		System.out.println("Exercice 3 Tableaux multidimensionnels");
		
		int[][] tableaux = new int[4][2]; // On déclare un tableau de dimensions 4*2
		
		for(int i=3; i>=0; i--) {
			for(int j=1; j>=0; j--) {
				tableaux[i][j] = j;
			}
		}
		
		for(int i=0; i<=3; i++) { // On décrémente
			for(int j=0; j<=1; j++) {
				System.out.print(tableaux[i][j] + " ");
			}
		}
		
		
	}
}
