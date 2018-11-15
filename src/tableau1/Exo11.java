package tableau1;

import java.util.Scanner;

public class Exo11 {
	public static void main(String [] args) 
	{ 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
			
			System.out.println("Exercice 11 Tableaux");
			int tail; 


			System.out.println("Entrez le nombre de valeurs :");
			tail = sc.nextInt();
			int[] tble = new int[tail];

			for(int i=0; i<tble.length; i++) {
					System.out.println("Entrez le nombre numéro : " + (i + 1));
					tble[i] = sc.nextInt();
					tble[i] = tble[i] + 1;

			}
			
			System.out.println("Nouveau tableau : ");
			
			for(int i=0; i<tble.length; i++) {
				System.out.print(tble[i] + " ");
			}
			
			
	}
}
