package tableau1;
 
import java.util.Scanner;

public class Exo10 {
	public static void main(String [] args) 
	{ 
		//Toujours et encore sur le même principe, écrivez un algorithme permettant, 
		// à l’utilisateur de saisir les notes d'une classe.
		// Le programme, une fois la saisie terminée, renvoie le nombre des notes supérieures 
		// à la moyenne de la classe.
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Exercice 10 Tableaux");

			int moy;
			int n=0;
			int som = -1;
			int moysup = -1;

			
			System.out.println("Combien de notes voulez-vous saisir ? ");
			n = Integer.parseInt(sc.nextLine());
			int tabble[] = new int[n]; 


			for(int i=0; i <= n-1; i++) {
					System.out.println("Entrez la note n° " + (i + 1));
					tabble[i] = Integer.parseInt(sc.nextLine());
					som = tabble[i];
					while(tabble[i] > 20|| tabble[i] < 0) { 
						System.out.println("Un note c'est entre 0 et 20");
						tabble[i] = Integer.parseInt(sc.nextLine());
						// On vérifie que l'utilisateur renseigne une note entre 0 et 20
					}
					
			}

			moy = som/n; // on calcule la moyenne
			
			for(int i=0; i < n; i++) {
					if(moy < tabble[i]) {
						moysup++; 
						// on détermine le nombre de moyennes supérieures à celle de la classe
					}
			}

			System.out.println("Il y a " + moysup + " note(s) supérieure(s) à la moyenne de la classe");
			
			
			
			
			
	}
}
