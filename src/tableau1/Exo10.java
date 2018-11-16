package tableau1;
 
import java.util.Scanner;

public class Exo10 {
	public static void main(String [] args) 
	{ 
		//Toujours et encore sur le m�me principe, �crivez un algorithme permettant, 
		// � l�utilisateur de saisir les notes d'une classe.
		// Le programme, une fois la saisie termin�e, renvoie le nombre des notes sup�rieures 
		// � la moyenne de la classe.
		
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
					System.out.println("Entrez la note n� " + (i + 1));
					tabble[i] = Integer.parseInt(sc.nextLine());
					som = tabble[i];
					while(tabble[i] > 20|| tabble[i] < 0) { 
						System.out.println("Un note c'est entre 0 et 20");
						tabble[i] = Integer.parseInt(sc.nextLine());
						// On v�rifie que l'utilisateur renseigne une note entre 0 et 20
					}
					
			}

			moy = som/n; // on calcule la moyenne
			
			for(int i=0; i < n; i++) {
					if(moy < tabble[i]) {
						moysup++; 
						// on d�termine le nombre de moyennes sup�rieures � celle de la classe
					}
			}

			System.out.println("Il y a " + moysup + " note(s) sup�rieure(s) � la moyenne de la classe");
			
			
			
			
			
	}
}
