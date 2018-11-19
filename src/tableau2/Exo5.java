package tableau2;

import java.util.Scanner;

public class Exo5 {
	 
	public static void main(String[] args) {
	
	 
		System.out.println("Exercice 5 Tableaux multidimensionnels");
		
		
		int [][] resultats = new int [4][3];
		
		int moyenne = 0;
		int moyenneJS = 0;
		int moyenneJava = 0;
		int moyenneCS = 0;
		int moyenneHTMLCSS = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// L'utilisateur saisit les notes :
		
		for(int i = 0; i<resultats.length; i++) {
			if(i==0) { // i nous permet d'avancer de matière en matière et vérifie 
				// auparavant que l'on a bien saise toutes les notes pzr matière
				System.out.println("\nNotes JavaScript : ");
			}
			if(i==1) {
				System.out.println("\nNotes Java : ");
			}
			if(i==2) {
				System.out.println("\nNotes C# : ");
			}
			if(i==3) {
				System.out.println("\nNotes HTML/CSS : ");
			}
			for(int j = 0; j<resultats[i].length; j++) { // j nous permet la saise des notes pour chaque matière
				System.out.println("Note numéro " + (j+1) + " : ");
				resultats[i][j]= sc.nextInt();
				
			}
		}	
		
		// Afficher la moyenne :

		for(int i = 0; i<resultats.length; i++) {

				if(i == 0) {
					for(int j = 0; j<resultats[i].length; j++) {
					
						moyenne += resultats[i][j];
						
					}
					 moyenneJS = moyenne/resultats[i].length;
					System.out.println("\nMoyenne JS : " + (moyenne/resultats[i].length));
				}
				if(i == 1) {
					moyenne = 0;
					for(int j = 0; j<resultats[i].length; j++) {
				
						moyenne += resultats[i][j];
						
					}
					moyenneJava = moyenne/resultats[i].length;
					System.out.println("Moyenne Java : " + (moyenne/resultats[i].length));
				}
				if(i == 2) {
					moyenne = 0;
					for(int j = 0; j<resultats[i].length; j++) {
			
						moyenne += resultats[i][j];
		
					}
					moyenneCS = moyenne/resultats[i].length;
					System.out.println("Moyenne C# : " + (moyenne/resultats[i].length));
				}
				if(i == 3) {
					moyenne = 0;
					for(int j = 0; j<resultats[i].length; j++) {
				
						moyenne += resultats[i][j];
				
					}
					moyenneHTMLCSS = moyenne/resultats[i].length;
					System.out.println("Moyenne HTML/CSS : " + (moyenne/resultats[i].length));
				}

		}
		
		// moyenne générale
		System.out.println("Moyenne générale : " + ((moyenneJS +moyenneJava + moyenneCS + moyenneHTMLCSS)/4));
		

		}
	
}
