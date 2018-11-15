package tableau1;
  
import java.util.Scanner;

public class Exo3 {
	public static void main(String[] args) 
	{ 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercice 3 Tableaux");
		
		
		 System.out.println("Veuillez saisir une taille de tab");
	     int size = sc.nextInt();

	     int[] tablo = new int[size];
	     int nbr;
	     int petit = 0;
	     int grand = 0;
	     boolean croissant = true;

	     for(int i=0; i < size;i++){
	         System.out.println("Veuillez saisir une valeur");
	         nbr = sc.nextInt();
	         tablo[i] = nbr;
	         if(i==0){
	             grand = tablo[i];
	             petit = tablo[i];
	         }else{
	             if(tablo[i]>grand){
	                 grand=tablo[i];
	             }else if(tablo[i]<petit){
	                 petit = tablo[i];
	             }else if(tablo[i]<tablo[i-1]){

	                 croissant = false;
	             }
	         }
	     }

	     System.out.println("grand = " + grand + ", petit = " + petit + ", croissant = " + croissant);
		
		
	  
	}
}
