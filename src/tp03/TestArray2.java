package tp03;

public class TestArray2 {

		public static void main(String[] args) {
			
			int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
			int index = 0;
			int repeat =0;
				
		    float somme = 0;
			for (int i=0; i<array.length;i++) {
		         System.out.print(array[i]+" ");
		         somme += array[i]; // on additionne les éléments du tableau
		         if(array[i]==15) {
				index = i;
				} for(int j = i+1; j < array.length; j++) {
					if(array[i] == array[j]) { // Déterminer le nombre de doublons
						repeat++; // On compte le nombre de doublons à chaque tour de boucle
					}
				}
		     }
		     
		    float moyenne = somme / array.length;
		    System.out.println(" ");
		    System.out.print("\nMoyenne = "+ moyenne + "\n\nL'index de l'entier 15 : " + index + "\n\n" + repeat + " doublons dans le tableau");
		     		      		      		      		      
		      
		}
}
