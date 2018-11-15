package tableau2;

public class Exo5 {
	 
	public static void main(String[] args) {
	
	 System.out.println("Exercice 2 Tableaux multidimensionnels");
     
	   	int[][] tablea = new int[2][3]; 
		int valeur = 0;

		for(int i=0; i<=1; i++) {
			for(int j=0; j<=2; j++) {
				tablea[i][j] = valeur;
				valeur++;
			}
		}
		
		
		System.out.println("Exercice 3 Tableaux multidimensionnels");
		
		int[][] tableaux = new int[4][2]; 
		
		for(int i=3; i>=0; i--) {
			for(int j=1; j>=0; j--) {
				tableaux[i][j] = j;
			}
		}
		
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=1; j++) {
				System.out.println(tableaux[i][j]);
			}
		}
		
		
		
		System.out.println("Exercice 4 Tableaux multidimensionnels");


		int mini = 0;
		int max = 2150;
		int range = max - mini ;
		int imax = 0;
		int jmax = 0;
		int mmax = 0;

		int[][] table = new int[12][8];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = (int) ((Math.random() * range) - mini);
				if (table[i][j] > mmax) {
					mmax = table[i][j];
					imax = i;
					jmax = j;
				}System.out.print (table[i][j]+" ");
			}					
		}
		System.out.println();
		System.out.println("Le plus grand élément est " + mmax + " et il se trouve aux indices " + imax + "," + jmax);
		
		
		
		
		System.out.println("Exercice 5 Tableaux multidimensionnels");
		
		
		
		int[][] notes = new int[4][3];   for(int=0; i<tab.length; i++) {
			
		}
	}
}
