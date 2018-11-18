package tp03;

import java.util.Scanner;
 
public class TestFibonacci {
	
	public static void main(String[] args) {
 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// Demander à l’utilisateur de choisir un rang N
		System.out.println("Saisir un rang N : ");
		int rangN = sc.nextInt();
		
		// On implémente la méthode écrite en bas en utilisant rangN en tant qu'argument
		System.out.println("le nombre est de "+ calculeAfficheRang(rangN));
		
	}
	
	
	// Méthode qui calcule et affiche le nombre de rang N  
	public static int calculeAfficheRang(int rangN) {

		int tableau [] = new int [rangN + 2];
		tableau[0]=0;
		tableau[1]=1;
	
			for(int i=2; i<=rangN; i++) {
				tableau[i]=tableau[i-2]+tableau[i-1];
			}
		return tableau[rangN-1];
	}

}
