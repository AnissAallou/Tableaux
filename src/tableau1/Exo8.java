package tableau1;

import java.util.Scanner;

public class Exo8 {
	public static void main(String [] args) 
	{ 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		

			System.out.println("Exercice 8 Tableaux");
			
			int multiple;
			int n=0;
			multiple=0;
			System.out.println("Entrez le nombre de valeurs : ");
			n = Integer.parseInt(sc.nextLine());

			int tabulation[] = new int[n]; 

			
			for(int i=0; i< n; i++) { 
					System.out.println("Entrez le nombre numéro : " + (i +1));
					tabulation[i] = Integer.parseInt(sc.nextLine());
						if(tabulation[i]%3 == 0) {
							multiple = multiple + 1;
						}
			}


			System.out.println("Nombre de valeurs multiples de 3 : " + multiple);
			System.out.println("Nombre de valeurs non multiples de 3 : " + (n - multiple));
			
			
	}
}
