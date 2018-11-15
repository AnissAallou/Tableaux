package tableau1;


public class Exo12 {
	public static void main(String [] args) 
	{ 
		

			
			System.out.println("Exercice 12 Tableaux");

			
			int[] dbz = new int[] {4,8,7,9,1,5,4,6}; 
			int[] naruto = new int[] {7,6,5,2,1,3,7,4}; 
			int redDead[] = new int[8]; 



			for(int i=0; i<=7; i++) {
						redDead[i] = dbz[i] + naruto[i];
			}

			for(int i=0; i<=7;i++) {
				System.out.print(redDead[i] + " ");
			}
			
	}
}
