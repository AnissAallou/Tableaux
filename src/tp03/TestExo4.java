package tp03;

import java.util.Scanner;

public class TestExo4 {
	
	public static void main(String[] args) {
		 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		

		// On déclare notre tableau d'origine
		int [] oldArray = new int [0]; 
		
		// On initialise une variable booléenne à VRAI pour lancer notre boucle 
		// et activer le menu
		boolean enter=true;
		
		while(enter == true) {
		
		System.out.println("1 : Saisir un nombre" + "\n2 : Consulter le tableau" + "\n0 : Quit");
		int option = sc.nextInt();	
		
		System.out.println("\n");
		
		// On redemande en boucle à l'utilisateur de saisir un nombre valide pour utiliser
		// une option existante
		while(option<0 || option>2) {
			System.out.println("Tapez 1 ou 2 pour que ça marche... sinon 0 pour sortir : ");
			option = sc.nextInt();
			System.out.println(" ");
		}
		
			if(option == 1) {
				System.out.println("Ajouter un nombre : ");
				int [] newArray = new int[oldArray.length+1];

				// on remplit le nouveau tableau des valeurs de lancien
				for(int i = 0; i<oldArray.length; i++) {
					newArray[i]=oldArray[i];
				}
				// agrandir la taille du tableau
				oldArray = new int[newArray.length];
				
				// le tableau est mis à jour
				for(int i = 0; i<oldArray.length; i++) {
					oldArray[i]=newArray[i];
				}
				
				// ajouter au tableau la valeur saisie
				oldArray[oldArray.length-1]=sc.nextInt();
				System.out.println("\n");

			}if(option == 2) {

				for(int i = 0; i<oldArray.length; i++) {
					System.out.print(oldArray[i]+ " ");
				}
				System.out.println("\n");
			}if(option == 0) {
				enter = false; // On sort de la boucle et donc du menu
				System.out.println("\nSortie du menu"); 
				// On informe l'utilisateur qu'il a quitté le programme
			}
	
		}
				
	}

}
