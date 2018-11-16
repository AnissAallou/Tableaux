package tableau2;

import java.util.Scanner;

public class Exo6 {
	 
	public static void main(String[] args) {
	

		
		
		System.out.println("Exercice 6 Tableaux multidimensionnels");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int player, i = 0 ,j=0; 
		boolean game, c;
		boolean r = game = c = true;
		

		String[][] tab = {
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
			{" X "," X ", " X "," X "," X "," X "," X "," X "," X "," X "},
		};
		
		
		affiche(tab); // On utilise la méthode pour afficher le tableau et commencer le jeu
		
		

		while (r == true) {
			System.out.println("Quelle ligne ?");
			i = sc.nextInt();
			// On demande à l'utilisateur sur quelle ligne il veut commencer en abscisse
			if (i>=0 && i<=10) {
				r = false;
			}else {
				System.out.println("Entre 0 et 10 : ");
				i= sc.nextInt();
				// Il faut obligatorement saisir entre 0 et 10 pour ne pas sortir des 
				// dimensions du damier
			}
		}
		while(c == true) {
			System.out.println("Quelle colonne ?");
			j = sc.nextInt();
			// On demande à l'utilisateur sur quelle colonne il veut commencer en ordonnée
			if (j>=0 && j<=10) {
				c = false;
			}else {
				System.out.println("Entre 0 et 10 : ");
				j = sc.nextInt();
				
				
			}
		}

		while (game) {
			
			tab[i-1][j-1] = " O ";
			int rowToForget = i;
			int columnToForget = j;
			// on remet à "X" la case sur laquelle on a joué
			affiche(tab);
			System.out.println("Tu veux jouer où ? \nTapez 1 pour jouer en haut et à gauche\nTapez 2 pour jouer en haut et à droite\nTapez 3 pour jouer en bas et à gauche\nTapez 4 pour jouer en bas et à droite");
			player = sc.nextInt();
			tab[rowToForget-1][columnToForget-1] = " X ";
			if (player == 1) {
				for(i=0; i<10; i++) {
					for(j=0; j<10; j++) {
				tab[i][j] = " X ";
					}
				}
				if (i==0 || j ==0) {
					game=false;
				}else {
					tab[i-1][j-1] = " X ";
					i = i-1;
					j = j-1;
				}
			}else if (player == 2) {
				
				if (i==0 || j ==9) {
					game=false;
				}else {
					
					tab[i-1][j+1] = " X ";
						
					i = i-1;
					j = j+1;
				}
			}else if (player == 3) {
			
				if (i==9 || j ==0) {
					game=false;
				}else {
					tab[i+1][j-1] = " X ";
					i = i+1;
					j = j-1;
				}
			}else if (player == 4) {
				
				if (i==9 || j ==9) {
					game = false;
				}else {
					
					tab[i][j] = " X ";
					i = i+1;
					j = j+1;
					
				}
			} else if (player == 5) {
				game = false;
				System.out.println("Arrêt du jeu : ");
				// Si l'utilisateur en a marre de jouer :)
				
			} else if (player!=1 || player!=2 || player!=3 || player!=4 || player!=5 ) {
				System.out.println("Entre 1 et 5 !");
				// L'utilisateur ne peut que saisir les options entre 1 et 5
				player = sc.nextInt();
			} 
		}
		System.out.println("GAME OVER !");
	}
	public static void affiche(String[][] tab) {
		
		for(int c =0;c<tab.length;c++ ) {
			for(int l =0;l<tab.length;l++ ) {
				System.out.print(tab[c][l]);
			}
			System.out.println("");
		}
		
	}
}
