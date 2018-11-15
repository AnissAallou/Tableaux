package tableau1;

 
public class Exo6 {
	public static void main(String [] args) 
	{ 
	
			System.out.println("Exercice 6 Tableaux");
			
			int[] nombre2 = new int[7];

			
			nombre2[0] = 1;
			for(int k=1; k<=5; k++) { 
			nombre2[k]= nombre2[k-1] + 2;
			}
			for(int i=0; i<=6; i++) {
			System.out.print(nombre2[i] + " ");
			}
			

			
	}
}
