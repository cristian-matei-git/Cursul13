package tema;

import java.util.Scanner;

public class CiurulLuiEratostene {

	public static void eratostene(int number) {

	      int numberSqrt =(int) Math.sqrt(number);

	      boolean[] notPrime = new boolean[number + 1];

	      for (int m = 2; m <= numberSqrt; m++) {

	            if (!notPrime[m]) {
	            	
	                  System.out.print(m + "\t");

	                  for (int k = m * m; k <= number; k += m) {

	                        notPrime[k] = true;
	                  }
	            }
	            
	      }
	      System.out.println();
	      
	      for (int m = numberSqrt; m <= number; m++) {

	            if (!notPrime[m]) {
	            
	                  System.out.print(m + "\t");
	            }
	            if(m % 19 == 0) {
	            	System.out.println();
	            }
	      }
	}
	

   public static void main(String[] args) {
 
       eratostene(100);
   }

}

