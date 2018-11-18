package tp03;

public class TestArray1 {
 
		public static void main(String[] args) {
			
			System.out.println("EXERCICE 1:");
			
			
			System.out.println("\nTableau :");
			
			int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
			
			int grand = Integer.MIN_VALUE;
			int petit = Integer.MAX_VALUE;
			
			// Afficher l’ensemble des éléments du tableau grâce à une boucle
			
			for(int i=0; i<array.length; i++) {
				System.out.print(array[i] + " ");
			}
			
			System.out.println(" ");
			
			System.out.println("\nTableau inverse :");
			
			// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
			// On décrémente i qui est forcément positif à l'initialisation
			for (int i = (array.length -1) ; i >= 0  ; i--){
			      System.out.print(array[i] + " ");
			}
			
			System.out.println(" ");
			
			System.out.println("\nEntiers du tableau supérieurs à 3 : ");
        
			// La boucle nous permet d'effectuer un test de manière 
			// à n’afficher que les entiers supérieurs à 3
			for(int i = 0; i < array.length; i++) {
				if(array[i]>3) {
				// On teste que le contenu de chaque index 
				// dans le tableau est supérieur à 3
				System.out.print(array[i] + " ");    
				} if(array[i]%2 == 0) {
					// On teste pour chaque entier la divisibilité par 2 
					System.out.print(array[i] + " ");    
					} if(array[i]>grand) { // Si la valeur de l'index du tableau est supérieure à la valeur maximale
						grand = array[i]; // On affecte la valeur de cette index à la variable de la plus grande valeur
					} else if(array[i] < grand) { // Si la valeur de l'index du tableau est inférieure à la valeur minimale
						petit = array[i]; // On affecte la valeur de cette index à la variable de la plus petite valeur
					}
			} 
			
			System.out.println(" ");
			
			System.out.println("\nEntiers pairs du tableau : "); 
			
			for(int i = 0; i < array.length; i++) {
				if(array[i]%2 == 0) {
				// On teste pour chaque entier la divisibilité par 2 
				System.out.print(array[i] + " ");    
				} if(array[i]>grand) { // Si la valeur de l'index du tableau est supérieure à la valeur maximale
					grand = array[i]; // On affecte la valeur de cette index à la variable de la plus grande valeur
				} else if(array[i] < grand) { // Si la valeur de l'index du tableau est inférieure à la valeur minimale
					petit = array[i]; // On affecte la valeur de cette index à la variable de la plus petite valeur
				}
			}
			
			System.out.println(" ");

			
			// Affichage du plus grand élément du tableau
			System.out.println("\nPlus grand élément du tableau : " + grand);

			
			// Affichage du plus petit élément du tableau
			System.out.println("Plus petit élément du tableau : " + petit);
			
		}
}
