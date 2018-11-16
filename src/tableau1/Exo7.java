package tableau1;

public class Exo7 {
	public static void main(String [] args) 
	{ 
 
			// L'algorithme suivant produit une suite de Fibonacci.
			// Remplissage d'un tableau de 7 valeurs.
			// Les valeurs en sortie sont : 1, 1, 2, 3, 5, 8, 13.
		
			System.out.println("Exercice 7 Tableaux");

			int suite[] = new int[7]; 
			
			suite[0] = 1;
			suite[1] = 1;
			for(int i=2; i<=6; i++) {
			suite[i] = suite[i-1] + suite[i-2];
			}
			for(int i=0; i<=6; i++) {
			System.out.print(suite[i] + " ");
			}
			
			
			// On simplifie l'algo en une boucle
			System.out.println("Version simplifiée");
			suite = new int[9];	
			suite[0] = 1;
			for(int i=2; i<suite.length; i++) { 
				suite[i]= suite[i-1] + suite[i-2];
				System.out.print(suite[i] + " ");
			}
			
	}
}
