package tableau1;
 
import java.util.Scanner;

public class Exo10 {
	public static void main(String [] args) 
	{ 
		
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
						System.out.println("Un note c'est entre 0 et 20 tocard :p");
						tabble[i] = Integer.parseInt(sc.nextLine());
					}
					
			}

			moy = som/n;
			
			for(int i=0; i < n; i++) {
					if(moy < tabble[i]) {
						moysup++;
					}
			}

			System.out.println("Il y a " + moysup + " note(s) supérieure(s) à la moyenne de la classe");
			
			
			
			
			
	}
}
