package tp03;

public class TestArray1 {

		public static void main(String[] args) {
			
			System.out.println("EXERCICE 1:");
			
			
			System.out.println("\nTableau :");
			
			int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
			
			for(int i=0; i<array.length; i++) {
				System.out.print(array[i] + " ");
			}
			
			System.out.println(" ");
			
			System.out.println("\nTableau inverse :");
			
			for (int i = (array.length -1) ; i >= 0  ; i--){
				 
			      System.out.print(array[i] + " ");
			 
			   }
			
			
			System.out.println(" ");
			
			System.out.println("\nEntiers du tableau supérieurs à 3 : ");
        
			for(int i = 0; i < array.length; i++) {
				if(array[i]>3) {
				System.out.print(array[i] + " ");    
				}
			} 
			
			System.out.println(" ");
			
			System.out.println("\nEntiers pairs du tableau : "); 
			
			for(int i = 0; i < array.length; i++) {
				if(array[i]%2 == 0) {
				System.out.print(array[i] + " ");    
				}
			}
			
		}
}
