package tableau1;

public class Exo7 {
	public static void main(String [] args) 
	{ 

			
			System.out.println("Exercice 7 Tableaux");

			int suite[] = new int[7]; 
			
			suite[0] = 1;
			suite[1] = 1;
			for(int i=2; i<=6; i++) {
			suite[i] = suite[i-1] + suite[i-2];
			}
			for(int i=0; i<=6; i++) {
			System.out.print(suite[i] + " ");
			}
			
			
	}
}
