package tableau1;


 public class Exo12 {
	public static void main(String [] args) 
	{ 
		
	// Ecrivez un algorithme constituant un tableau, à partir de deux tableaux de même longueur
    // préalablement saisis. Le nouveau tableau sera la somme des éléments 
	// des deux tableaux de départ.
			
			System.out.println("Exercice 12 Tableaux");

			
			int[] tab1 = new int[] {4,8,7,9,1,5,4,6}; 
			int[] tab2 = new int[] {7,6,5,2,1,3,7,4}; 
			int tab3[] = new int[8]; 



			for(int i=0; i<=7; i++) {
						tab3[i] = tab1[i] + tab2[i]; // On additionne les valeurs du premier tableau
						// avec celles du second en procédant colonne par colonne
						// {4 + 7, 8 + 6, 7 + 5, 9 + 2, 1 + 1, 5 + 3, 4 + 7, 6 + 4}
			}

			for(int i=0; i<=7;i++) {
				System.out.print(tab3[i] + " ");
			}
			
	}
}
