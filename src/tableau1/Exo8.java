package tableau1;

import java.util.Scanner;
  
public class Exo8 {
	public static void main(String [] args) 
	{ 
	// Ecrivez un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, 
	// qui devront être stockées dans un tableau.
				
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		// L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il compte saisir. 
		// Il effectuera ensuite cette saisie.
		// Enfin, une fois la saisie terminée, le programme affichera le nombre de valeurs multiples 
		// de 3 et le nombre de valeurs non multiple de 3.
			
			System.out.println("Exercice 8 Tableaux");
			
			int multiple;
			int n=0;
			multiple=0;
			System.out.println("Entrez le nombre de valeurs : ");
			n = Integer.parseInt(sc.nextLine());

			int table[] = new int[n]; 

			
			for(int i=0; i< n; i++) { 
					System.out.println("Entrez le nombre numéro : " + (i +1));
					table[i] = Integer.parseInt(sc.nextLine());
						if(table[i]%3 == 0) {
							// On fait un test pour vérifier si chaque valeur du tableau 
							// est un modulo de 3 
							// divisible par 3
							multiple = multiple + 1; // on compte le nombre de multiples
						}
			}


			System.out.println("Nombre de valeurs multiples de 3 : " + multiple);
			System.out.println("Nombre de valeurs non multiples de 3 : " + (n - multiple));
			// le nombre de non multiples restants résulte de la différence entre 
			// le nombre total de valeurs 
			// et le nombre de multiples
			
			
	}
}
