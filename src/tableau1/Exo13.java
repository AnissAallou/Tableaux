package tableau1;



public class Exo13 {
	public static void main(String [] args) 
	{ 

			System.out.println("Exercice 13 Tableaux");
			
			int joke = 0;


				int[] dbs = new int[] {4,8,7,12};
				int[] nwaruto = new int[] {3,6};
				


				for(int i=0; i<=3; i++) {
					for(int j=0; j<=1; j++) {
						joke = joke + (dbs[i] * nwaruto[j]);
				}
			}
						


				System.out.print("JOKE : " + joke);
	}
}
