package tableau1;

 

public class Exo13 {
	public static void main(String [] args) 
	{ 
		
	// Toujours � partir de deux tableaux pr�c�demment saisis, �crivez un algorithme 
	//qui calcule le � JOKE � des deux tableaux. Pour calculer le � JOKE �, 
	// il faut multiplier chaque �l�ment du tableau 1 par chaque �l�ment du tableau 2, 
	// et additionner le tout. 
		
			System.out.println("Exercice 13 Tableaux");
			
			int joke = 0;


				int[] tab1 = new int[] {4,8,7,12};
				int[] tab2 = new int[] {3,6};
				
				


				for(int i=0; i<=3; i++) {
					for(int j=0; j<=1; j++) { 
						joke = joke + (tab1[i] * tab2[j]); 
						// On multiplie les indices du tableau 1 avec ceux du tableau 2
						// et on additionne les produits entre eux
				}
			}
						


				System.out.print("JOKE : " + joke);
	}
}
