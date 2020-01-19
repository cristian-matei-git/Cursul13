package tema;

public class Exercitiul2 {
	
	public static int[][] matrixSum(int[][] matrixA, int[][] matrixB) {
		int[][] matrixC = new int[matrixA.length][matrixA[0].length];
		
		for(int i = 0; i < matrixA.length; i++) {
			
			for(int j = 0; j < matrixA[i].length; j++) {
				
				matrixC[i][j] = matrixA[i][j] + matrixB [i][j];
			}
		}
		return matrixC;
	}
	
	public static int[][] matrixDiff(int[][] matrixA, int[][] matrixB) {
		int[][] matrixC = new int[matrixA.length][matrixA[0].length];
		
		for(int i = 0; i < matrixA.length; i++) {
			
			for(int j = 0; j < matrixA[i].length; j++) {
				
				matrixC[i][j] = matrixA[i][j] - matrixB [i][j];
			}
		}
		return matrixC;
	}
	
	public static int[][] matrixMul(int[][] matrixA, int[][] matrixB) {
		
		int[][] matrixC = new int[matrixA.length][matrixB[0].length];
		
		for(int i = 0; i < matrixA.length; i++) {
			
			for(int j = 0; j < matrixB[0].length; j++) {
				
				for(int k = 0; k < matrixB.length; k++) {
					
					matrixC[i][j] += matrixA[i][k] * matrixB [k][j];
				}
			}
		}
		return matrixC;
	}
	
	public static int[][] matrixMulScalar(int[][] matrixA, int number) {
		
		int[][] matrixC = new int[matrixA.length][matrixA[0].length];
		
		for(int i = 0; i < matrixA.length; i++) {
			
			for(int j = 0; j < matrixA[0].length; j++) {
					
					matrixC[i][j] = matrixA[i][j] * number;
				
			}
		}
		return matrixC;
	}
	
	public static void printMatrix(int[][] array) {
		
		for(int i=0; i<array.length; i++) {
			
			  for (int j = 0; j < array[i].length; j++) {
				  
			    System.out.print(array[i][j] + "\t");
			    
			  }
			  
			  System.out.println();
			}
	}

	public static void main(String[] args) {
		
		int[][] matrixA = new int[3][2];
		int[][] matrixB = new int[3][2];
		int[][] matrixC = new int[3][2];
		int[][] matrixD = new int[2][3];
		
		matrixA[0][0] = 2;
		matrixA[0][1] = 10;
		matrixA[1][0] = 8;
		matrixA[1][1] = 1;
		matrixA[2][0] = 5;
		matrixA[2][1] = 5;
		
		matrixB[0][0] = 4;
		matrixB[0][1] = 7;
		matrixB[1][0] = 0;
		matrixB[1][1] = 3;
		matrixB[2][0] = 5;
		matrixB[2][1] = 10;
		
		matrixC[0][0] = 2;
		matrixC[0][1] = 3;
		matrixC[1][0] = 6;
		matrixC[1][1] = 1;
		matrixC[2][0] = 5;
		matrixC[2][1] = 1;
		
		matrixD[0][0] = 4;
		matrixD[0][1] = 3;
		matrixD[0][2] = 0;
		matrixD[1][0] = 5;
		matrixD[1][1] = 5;
		matrixD[1][2] = 1;
		
		System.out.println("Sum of A and B\n");
		printMatrix(matrixSum(matrixA, matrixB));
		System.out.println();
		System.out.println("Difference of A and B\n");
		printMatrix(matrixDiff(matrixA, matrixB));
		System.out.println();
		System.out.println("Multiplication of C and D\n");
		printMatrix(matrixMul(matrixC, matrixD));
		System.out.println();
		System.out.println("Multiplication of B and 2\n");
		printMatrix(matrixMulScalar(matrixB, 2));
	}

}
