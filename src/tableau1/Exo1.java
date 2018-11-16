package tableau1;
 

public class Exo1 {
	public static void main(String [] args) 
	{  
		

		
		System.out.println("Exercice 1 Tableaux");
		
		// Ecrire un algorithme qui déclare un tableau de 10 éléments, 
		// le remplir du chiffre 0 au chiffre 9 et affiche ensuite
		// à l'utilisateur toutes les valeurs de ce tableau.
		
		int[] tab = new int[]{0,1,2,3,4,5,6,7,8,9};
		
		// La boucle for est utilisée pour afficher le contenu du tableau
		for(int i=0; i<=tab.length; i++) {
		  System.out.print(i + " ");
		}
		
		
	}
}
