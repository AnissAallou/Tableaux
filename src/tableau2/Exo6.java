package tableau2;

import java.util.Scanner;

public class Exo6 {
	
	public static void main(String[] args) {
	

		
		
		System.out.println("Exercice 6 Tableaux multidimensionnels");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int player;
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
		
		
		affiche(tab);
		
		

		while (r == true) {
			System.out.println("Quelle ligne ?");
			int i = sc.nextInt();
			if (i>=0 && i<=10) {
				r = false;
			}else {
				System.out.println("Entre 0 et 10 : ");
				i= sc.nextInt();
			}
		}
		while(c == true) {
			System.out.println("Quelle colonne ?");
			int j = sc.nextInt();
			if (j>=0 && j<=10) {
				c = false;
			}else {
				System.out.println("Entre 0 et 10 : ");
				j = sc.nextInt();
			}
		}

		while (game) {
			int i = 0;
			int j = 0;
			tab[i][j] = " O ";
			
			affiche(tab);
			System.out.println("Tu veux jouer où ? \nTapez 1 pour jouer en haut et à gauche\nTapez 2 pour jouer en haut et à droite\nTapez 3 pour jouer en bas et à gauche\nTapez 4 pour jouer en bas et à droite");
			player = sc.nextInt();
			if (player == 1) {
				for(i=0; i<10; i++) {
					for(j=0; j<10; j++) {
				tab[i][j] = " O ";
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
			}else if (player < 1 && player > 4) {
				System.out.println("Entre 1 et 4 !");
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
