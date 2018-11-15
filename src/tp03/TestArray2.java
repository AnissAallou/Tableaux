package tp03;

public class TestArray2 {

		public static void main(String[] args) {
			
			int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
			int index = 0;
		
			
		    float somme = 0;
			for (int i=0; i<array.length;i++) {
		         System.out.print(array[i]+" ");
		         somme += array[i];
		         if(array[i] == 15) {
		        	 index = i;
		         }
		         
		         
		      }
		      float moyenne = somme / array.length;
		 
		      System.out.print("\nMoyenne = "+ moyenne);
		      
		      
		      System.out.println("\n");; 
		      
		      System.out.println("L'index de l'entier 15 : " + index);
		   // l'index de l'entier 15 est 1 
		    
		      
		      System.out.println("\n");; 
		      
		      System.out.println("Les doublons dans le tableau : ");
		      
		      int temp;
		      // boucle
		      
		      for(int i = 0; i < array.length; i++) {
		    	
		    	  if(array[i] > array[i+1]) { 
		    			  temp = array [i];
		    			  array[i] = array[i+1];
		    			  array[i+1] = temp;
		    	  }
		    	  System.out.print(array[i]);
		      }
		      
		      
		      
		      
		      
		}
}
