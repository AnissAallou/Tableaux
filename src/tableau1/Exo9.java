package tableau1;

import java.util.Scanner;

public class Exo9 {
	public static void main(String [] args) 
	{ 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Exercice 9 Tableaux");
			
			int n=0;
			int plusgrand=-1;
			System.out.println("Entrez le nombre de valeurs : ");
			n = Integer.parseInt(sc.nextLine());
			int tbl[] = new int[n];

			int position = 1;
			
			for(int i=0; i<=n-1; i++) {
					System.out.println("Entrez le nombre numéro : " + (i+1));
					tbl[i] = Integer.parseInt(sc.nextLine());
					if(tbl[i] > plusgrand) {
						plusgrand = tbl[i];
						position = i + 1;
					}
			}
			

			System.out.println("La plus grande valeur est : " + plusgrand);
			System.out.println("Position occupée : " + position);
			
			
			
	}
}
