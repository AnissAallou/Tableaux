package tableau1;

import java.util.Scanner;

public class Exo2 {
	public static void main(String[] args) 
	{ 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Exercice 2 Tableaux");
		
		
		System.out.println("saisir taille du tableau svp ! ");         
		int taille = Integer.parseInt(sc.nextLine());         
		int tableau [] = new int [taille];         
		int elementsInverses [] = new int [taille];                  
		for(int i = 0; i < tableau.length; i++) {             
			System.out.println("saisir une valeur ");             
			tableau  [i] =  Integer.parseInt(sc.nextLine());             
			elementsInverses [ taille - 1 - i] = tableau  [i];         
			}         
		System.out.println("tableau : ");         
		for(int i = 0; i <tableau .length; i++) {             
			System.out.println( tableau  [i]);                      
		}         System.out.println("tableau inverse:  ");         
		
		for(int i = 0; i < elementsInverses.length; i++) {             
			System.out.println( elementsInverses [i]);         
		}
		
		
		
	}
}
