package tableau1;

import java.util.Scanner;
 
public class Exo4 {
	public static void main(String [] args) 
	{ 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		

	     
	 	System.out.println("Exercice 4 Tableaux");
		
		int s;
		int[] notes = new int[10];

			
			s = 0;

			for(int i=0; i<10; i++) {
				System.out.println("Entrez la note numéro : " + (i + 1));
			    notes[i] = sc.nextInt();
			    while (notes[i] < 0 || notes[i] > 20) {
			    	System.out.println("Une note est comprise entre 0 et 20 : ");
				    notes[i] = sc.nextInt();
			    }
				s = s + notes[i];
			}

			System.out.println("somme : " + s + " moyenne : " + s/10);
			
			
	}
}
