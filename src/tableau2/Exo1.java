package tableau2;

public class Exo1 {
	
	// Écrivez un algorithme remplissant un tableau de 6 sur 13, avec des zéros.
	 
	public static void main(String[] args) {
	
		int[][] tab = new int[6][13];
		
		for(int i=0; i<6; i++) {
		  for(int j=0; j<13; j++) {
		    tab[i][j] = 0;
		    System.out.print(tab[i][j] + " "); // On affecte la valeur zéro à toutes les cases du tableau
		    // Aussi bien en ligne qu'en colonne
		}
		  
		  System.out.println(" ");
		}
		

		
	}
}
